# SPRING PLUS

## ✅ 기능 개선 사항 요약

JPA의 이해를 바탕으로 데이터 처리 흐름을 점검하고, 트랜잭션 및 성능 개선을 적용하여 안정적인 기능 구현이 가능해졌습니다.  
또한 인증, AOP, 예외 처리, 테스트 코드 등 전반적인 구조를 수정하며 코드의 확장성과 유지보수성을 높일 수 있었습니다.

---
### 1. @Transactional의 이해

- readOnly 설정으로 인해 INSERT 불가 오류를 수정했습니다.
- feat: User 엔티티에 nickname 기능 추가, 할 일 저장 기능에 트랜젝션 어노테이션 추가

#### ✅ 변경된 파일 목록
- JwtUtil.java
- TodoController.java
- TodoRepository.java
- TodoService.java
- UserController.java
- User.java
- UserService.java

### 2. JWT의 이해

- User 엔티티에 nickname 컬럼을 추가하고, JWT에서 nickname을 추출할 수 있도록 처리했습니다.
- feat: User 엔티티에 nickname 기능 추가, 할 일 저장 기능에 트랜젝션 어노테이션 추가

#### ✅ 변경된 파일 목록
- JwtUtil.java
- TodoController.java
- TodoRepository.java
- TodoService.java
- UserController.java
- User.java
- UserService.java

### 3. JPA의 이해

- JPQL을 사용하여 weather 조건과 수정일 기간 조건으로 검색할 수 있도록 구현했습니다.
- feat: 할 일 검색시 조건에 따라 조회할 수 있도록 수정

#### ✅ 변경된 파일 목록
- JwtUtil.java
- TodoController.java
- TodoRepository.java
- TodoService.java

### 4. 테스트 코드 컨트롤러 테스트의 이해

- Todo 단건 조회 시 예외 발생 테스트가 통과되도록 수정했습니다.
- feat: 테스트코드 정상적으로 수정

#### ✅ 변경된 파일 목록
- TodoControllerTest.java

### 5. AOP의 이해

- AOP가 UserAdminController의 changeUserRole() 메서드 실행 전에 동작하도록 수정했습니다.
- feat: AOP메서드 호출 조건 수정
  
#### ✅ 변경된 파일 목록
- AdminAccessLoggingAspect.java
  
### 6. JPA Cascade
- 할 일 생성 시 작성자가 자동으로 담당자로 등록되도록 Cascade 설정을 적용했습니다.
- feat: cascade로 담당자 자동 등록
  
#### ✅ 변경된 파일 목록
- Todo.java


### 7. N+1
- getComments() 호출 시 발생하던 N+1 문제를 Fetch Join으로 해결했습니다.
- feat: N+1문제 해결
  
#### ✅ 변경된 파일 목록
-CommentRepository.java
   
