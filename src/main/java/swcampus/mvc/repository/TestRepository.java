package swcampus.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import swcampus.mvc.domain.test;

public interface TestRepository extends JpaRepository<test, String>{
	
}
