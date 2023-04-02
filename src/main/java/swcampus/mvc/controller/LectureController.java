package swcampus.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import swcampus.mvc.domain.Likes;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.LectureDTO;
import swcampus.mvc.dto.LectureResponseDTO;
import swcampus.mvc.dto.LikesDTO;
import swcampus.mvc.service.LectureService;
import swcampus.mvc.service.LikesService;

@Controller
public class LectureController {

	@Autowired
	private LectureService lectureService;
	@Autowired
	private LikesService likeService;

	/**
	 * 강의등록 폼 열기
	 */

	@RequestMapping("/lecture/insertForm")
	public void lectureInsertForm(LectureDTO lectureDto) {

	}

	/**
	 * 강의등록하기
	 */

	@RequestMapping("/lecture/insert")

	public String lectureInsert(LectureDTO lectureDto) {
		lectureService.insertLecture(lectureDto);
		System.out.println("컨트롤러에서 " + lectureDto);
		return "";
	}

	/**
	 * 강의 상세조회
	 * 
	 * @param lectureNo
	 * @param userNo
	 */
	@RequestMapping("/details/details")
	public void selectLec(Long lectureNo,Model model,Long userNo) {
		LectureResponseDTO dto = lectureService.selectByLectureNo(lectureNo);
		
		//헤이 가이즈~~ 이거 시큐리티 되면 수정해 주이소 
	    int likesConfirm=likeService.selectLike(11L,3L);
		
		model.addAttribute("lecture", dto);
		model.addAttribute("confirm", likesConfirm);
	}

	/**
	 * 강의 수정하기
	 */
	@RequestMapping("/lecture/update")
	public void lectureUpdate(LectureDTO lectureDTO) {

		lectureService.updateLecture(lectureDTO);

	}

	/**
	 * 게시글 삭제하기
	 */
	@RequestMapping("/lecture/delete")
	public String deleteLec(Long LectureNo) {
		lectureService.deleteByLectureNo(LectureNo);
		return "";
	}

	/**
	 * 강의 전체조회
	 * 
	 */
	@RequestMapping("/de/list")
	public List<LectureResponseDTO> LectureList() {
		
		return null;
	}

	/**
	 * 카테고리별 강의 전체조회
	 * 
	 * @RequestMapping("/lecture/category") public List<LectureResponseDTO>
	 * LectureListByCa(){
	 * 
	 * return null; }
	 */

	/**
	 * 좋아요 기능 눌렀을 때 좋아요가 변경되는 기능
	 */
	/*
	 * @RequestMapping("/Lecture/likes")
	 * 
	 * @ResponseBody public int isLike(LikesDTO LikesDTO) { int likesedCount =
	 * lectureService.isLike(LikesDTO); return likesedCount; }
	 * 
	 *//**
		 * 좋아요 기능 눌렀을 때 좋아요가 변경되는 기능
		 *//*
			 * @RequestMapping("/lecture/likes")
			 * 
			 * @ResponseBody public int selectLike(Long likesNo) { int isLikes =
			 * likeService.selectLike(likesNo); return isLikes.; }
			 * 
			 * 
			 */
	@RequestMapping("/d")
	public void selectLike() {
		System.out.println(11);
		}
	
	

}// Class LectureController 끝
