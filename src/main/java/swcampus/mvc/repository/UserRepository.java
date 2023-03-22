package swcampus.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import swcampus.mvc.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
