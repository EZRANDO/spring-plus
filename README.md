# SPRING PLUS

## ✅ 기능 개선 사항 요약

JPA의 이해를 바탕으로 데이터 처리 흐름을 점검하고, 트랜잭션 및 성능 개선을 적용하여 안정적인 기능 구현이 가능해졌습니다.  
또한 인증, AOP, 예외 처리, 테스트 코드 등 전반적인 구조를 수정하며 코드의 확장성과 유지보수성을 높일 수 있었습니다.

---
### 1. @Transactional의 이해

- readOnly 설정으로 인해 INSERT 불가 오류를 수정했습니다.


### 2. JWT의 이해

- User 엔티티에 nickname 컬럼을 추가하고, JWT에서 nickname을 추출할 수 있도록 처리했습니다.


### 3. JPA의 이해

- JPQL을 사용하여 weather 조건과 수정일 기간 조건으로 검색할 수 있도록 구현했습니다.


### 4. 테스트 코드 컨트롤러 테스트의 이해

- Todo 단건 조회 시 예외 발생 테스트가 통과되도록 수정했습니다.


### 5. AOP의 이해

- AOP가 UserAdminController의 changeUserRole() 메서드 실행 전에 동작하도록 수정했습니다.


### 6. JPA Cascade

- 할 일 생성 시 작성자가 자동으로 담당자로 등록되도록 Cascade 설정을 적용했습니다.


### 7. N+1

- getComments() 호출 시 발생하던 N+1 문제를 Fetch Join으로 해결했습니다.
