package swcampus.mvc.service;

import java.util.List;

import swcampus.mvc.domain.Lecture;
import swcampus.mvc.domain.Likes;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.LikesDTO;

public interface LikesService {

	/**
	 * 강의 찜하기 
	 * */
	void insertLike(LikesDTO likeDto);

	/**
	 * 강의 찜취소
	 */
	void deleteLike(Long lectureNo, Long userNo);

	/**
	 * like 있는지 여부 검사
	 */
	int selectLike(LikesDTO likesDto);

	/**
	 * 좋아요 리스트 불러오기(유저 아이디 별)
	 * */
	List<Likes> selectId(LikesDTO likesDto);




	default Likes toEntitiy(LikesDTO dto, User user, Lecture lec) {
		return Likes.builder()
				.likesNo(dto.getLikesNo())
				.user(user)
				.lecture(lec)
				.build();

	}


}
