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
	
	@Autowired
	private LikesService likeServ;
	
	
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


	/**
	 * like 있는지 여부 검사
	 */
	@Override
	public Likes selectLike(Long likesNo) {
		return likesRep.findById(likesNo).orElse(null);
	}


	/**
	 * 좋아요 리스트 불러오기
	 * */
	@Override
	public List<Likes> selectLikesListByUserNo(String userNo) {
		// TODO Auto-generated method stub
		return null;
	}




	

}
