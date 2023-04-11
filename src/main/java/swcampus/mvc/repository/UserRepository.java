package swcampus.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import swcampus.mvc.domain.User;

public interface UserRepository extends JpaRepository<User, Long>, QuerydslPredicateExecutor<User>{
	
	User findByUserId(String userId);
}
