package swcampus.mvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import swcampus.mvc.domain.Likes;

public interface LikesRepository extends JpaRepository<Likes, Long> {

	List<Likes> findByLikesNo(Long likesNo);

}