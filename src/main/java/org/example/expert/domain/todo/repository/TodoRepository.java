package org.example.expert.domain.todo.repository;

import org.example.expert.domain.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface TodoRepository extends JpaRepository<Todo, Long> {

//    @Query("SELECT t FROM Todo t LEFT JOIN FETCH t.user u ORDER BY t.modifiedAt DESC")
//    Page<Todo> findAllByOrderByModifiedAtDesc(Pageable pageable);

    @Query("SELECT t FROM Todo t " +
            "LEFT JOIN t.user " +
            "WHERE t.id = :todoId")
    Optional<Todo> findByIdWithUser(@Param("todoId") Long todoId);

    //    @Query("SELECT t FROM Todo t WHERE(:weather IS NULL OR t.weather = :weather)")
    //    List<Todo> findTodosByWeather(@Param("weather") String weather

    //- 할 일 검색 시 `weather` 조건으로도 검색할 수 있어야해요.
    //    - `weather` 조건은 있을 수도 있고, 없을 수도 있어요!
    //작성자 정보가 화면에 표시되거나 비즈니스 로직에서 필요하지 않다면 JOIN불필요
    @Query("""
    SELECT t FROM Todo t 
    WHERE (:weather IS NULL OR t.weather = :weather)
      AND (:startDate IS NULL OR t.modifiedAt >= :startDate)
      AND (:endDate IS NULL OR t.modifiedAt <= :endDate)
    ORDER BY t.modifiedAt DESC
""")
    List<Todo> searchTodos(@Param("weather") String weather,
                           @Param("startDate") LocalDateTime startDate,
                           @Param("endDate") LocalDateTime endDate);
}
