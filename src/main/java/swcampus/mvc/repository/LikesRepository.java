package swcampus.mvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import swcampus.mvc.domain.Likes;

public interface LikesRepository extends JpaRepository<Likes, Long> {

	List<Likes> findByLikesNo(Long likesNo);


	Likes searchByLike(Long lectureNo, Long userNo);


	//유저 아이디별 찜모음(마이페이지)
	@Query("select like from Likes like where like.lecture.lectureNo = ?1 and like.user.userNo =?2 ")
	List<Likes> selectByUserId(Long likeNo,Long userNo);

}