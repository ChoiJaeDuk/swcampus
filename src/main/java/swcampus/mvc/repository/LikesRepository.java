package swcampus.mvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import swcampus.mvc.domain.Likes;

public interface LikesRepository extends JpaRepository<Likes, Long> {

	List<Likes> findByLikesNo(Long likesNo);
	
	@Query("select l from Likes l where l.lecture.lectureNo=?1 and l.user.userNo=?2")
	Likes selectLike(Long lectureNo, Long userNo);
	
	
}