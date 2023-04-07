package swcampus.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import swcampus.mvc.domain.Lecture;
import swcampus.mvc.domain.Likes;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.LikesDTO;
import swcampus.mvc.repository.LectureRepository;
import swcampus.mvc.repository.LikesRepository;
import swcampus.mvc.repository.UserRepository;


@Service
@RequiredArgsConstructor
@Transactional
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

		System.out.println(likes);

		likesRep.save(likes);
	}	



	/**
	 * 찜취소
	 */

	@Override
	public void deleteLike(Long lectureNo, Long userNo){
	
		Likes dblike=likesRep.selectLike(lectureNo, userNo);

		likesRep.deleteById(dblike.getLikesNo());

		
	}


	/**
	 * like 있는지 여부 검사
	 */
	@Override

	public int selectLike(Long lectureNo, Long userNo) {
		System.out.println("서비스오냐??");
		Likes dblike= likesRep.selectLike(lectureNo, userNo);
		if (dblike == null) { return 0;}
		return 1;
	}


/**

 * 좋아요 리스트 불러오기
 * */
@Override
public List<LikesDTO> selectLikesListByUserNo(String userNo) {


	return null;

}






}
