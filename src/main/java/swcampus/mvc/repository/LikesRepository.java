package swcampus.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import swcampus.mvc.domain.Likes;

public interface LikesRepository extends JpaRepository<Likes, Long> {
	
	
}
