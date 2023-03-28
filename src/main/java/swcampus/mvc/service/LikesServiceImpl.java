package swcampus.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import swcampus.mvc.domain.Lecture;
import swcampus.mvc.domain.Likes;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.LikesDTO;
import swcampus.mvc.repository.LectureRepository;
import swcampus.mvc.repository.LikesRepository;
import swcampus.mvc.repository.UserRepository;

public class LikesServiceImpl implements LikesService {

	@Autowired
	private LikesRepository likesRep;
	private UserRepository userRep;
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
	public void deleteLike(Long likeNo){
		likesRep.deleteById(likeNo);
		
	}

	@Override
	public Likes selectLike(Likes likes) {
		//Likes dblikes=likesRep.findById(likesNo).orElse(null);
		
		//return dblikes;
		return null;
	}
	
	/**
	 * 찜여부확인
	 */
	
	

	

}
