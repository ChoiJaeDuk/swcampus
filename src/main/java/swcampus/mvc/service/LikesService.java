package swcampus.mvc.service;

import swcampus.mvc.domain.Lecture;
import swcampus.mvc.domain.Likes;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.LikesDTO;

public interface LikesService {
	
	/**
	 * 강의에 찜 기능 : 게시물번호와 아이디가 fk
	 */
	void insertLike(LikesDTO likeDto);

	/**
	 * 강의에 찜 취소 기능 : 게시물번호와 아이디를 인수로 받아온다
	 */
	void deleteLike(Long likeNo);


	/**
	 * like 있는지 여부 검사
	 */
	Likes selectLike(Likes likes);
	
	
	
	default Likes toEntitiy(LikesDTO dto, User user, Lecture lec) {
		return Likes.builder()
				.likesNo(dto.getLikesNo())
				.user(user)
				.lecture(lec)
				.build();
		
	}

}
