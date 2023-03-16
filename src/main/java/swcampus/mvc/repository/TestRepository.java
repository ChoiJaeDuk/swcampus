package swcampus.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import swcampus.mvc.domain.Test;

public interface TestRepository extends JpaRepository<Test, String>{
	
}
