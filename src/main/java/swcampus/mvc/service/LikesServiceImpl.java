package swcampus.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import swcampus.mvc.domain.Lecture;
import swcampus.mvc.domain.Likes;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.LikesDTO;
import swcampus.mvc.repository.LectureRepository;
import swcampus.mvc.repository.LikesRepository;
import swcampus.mvc.repository.UserRepository;


@Service
public class LikesServiceImpl implements LikesService {

	@Autowired
	private LikesRepository likesRep;

	@Autowired
	private UserRepository userRep;

	@Autowired
	private LectureRepository lecRep;


	/**
	 * 찜하기
	 */
	@Override
	public void insertLike(LikesDTO likeDto) {
		User dbUser=userRep.findById(likeDto.getUserNo()).orElse(null);
		Lecture dbLect = lecRep.findById(likeDto.getLectureNo()).orElse(null);

		Likes likes = toEntitiy(likeDto,dbUser,dbLect);

		likesRep.save(likes);
	}	



	/**
	 * 찜취소
	 */

	@Override
	public void deleteLike(Long lectureNo, Long userNo){
		Likes like = likesRep.searchByLike(lectureNo, userNo);

		likesRep.deleteById(like.getLikesNo());
	}


	/**
	 * like 있는지 여부 검사
	 */
	@Override
	public int selectLike(LikesDTO likesDto) {

		Likes dblike= likesRep.searchByLike(likesDto.getLectureNo(), likesDto.getUserNo());
		if (dblike == null) {
			insertLike(likesDto);
			return 1;
		} else {
			deleteLike(likesDto.getLectureNo(), likesDto.getUserNo());
			return 0;
		}

	}

	/**
	 * 유저 아이디별 좋아요 리스트(마이페이지에서 사용?)
	 */
	@Override
	public List<Likes> selectId(LikesDTO likesDto) {

		return likesRep.selectByUserId(likesDto.getLectureNo(), likesDto.getUserNo());
	}






}
