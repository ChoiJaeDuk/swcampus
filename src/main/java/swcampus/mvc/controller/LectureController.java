package swcampus.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import swcampus.mvc.dto.LectureDTO;
import swcampus.mvc.dto.LectureResponseDTO;
import swcampus.mvc.service.LectureService;
import swcampus.mvc.service.LikesService;

@Controller
public class LectureController {

	@Autowired
	private LectureService lectureService;
	@Autowired
	private LikesService likeService;
	
	
	 //강의 전체조회

	@RequestMapping("/lecture/main")
	public void LectureList(Model model) {
		List<LectureResponseDTO> lecture = lectureService.selectAll();
		System.out.println(lecture);
		
		model.addAttribute("lecture", lecture);
		
	}

	/**
	 * 강의등록 폼 열기
	 */

	  @GetMapping("/admin/lectureInsertForm")
	public void lectureInsertForm(LectureDTO lectureDto) {

	}

	/**
	 * 강의등록하기
	 */

	@RequestMapping("/lecture/insert")
	public String insert(LectureDTO lectureDto) {
		lectureService.insertLecture(lectureDto);
		System.out.println("컨트롤러에서 " + lectureDto);
		return "redirect:/lecture/main";
		
	}
	
	/**
	 * 강의 상세조회
	 * 
	 * @param lectureNo
	 * @param userNo
	 */
	@RequestMapping("/lecture/details/{lectureNo}")
	public void selectLec(Long lectureNo,Model model,Long userNo) {
		LectureResponseDTO dto = lectureService.selectByLectureNo(lectureNo);
		
		//헤이 가이즈~~ 이거 시큐리티 되면 수정해 주이소 
	    int likesConfirm=likeService.selectLike(7L,3L);
		
		model.addAttribute("lecture", dto);
		model.addAttribute("confirm", likesConfirm);
	}


	/**	
	 * 강의 수정하기
	 */
	@RequestMapping("/lecture/update")
	public String lectureUpdate(LectureDTO lectureDTO) {

		lectureService.updateLecture(lectureDTO);
		
		return "/lecture/details/{lectureNo}";

	}

	/**
	 * 게시글 삭제하기
	 */
	@RequestMapping("/lecture/delete")
	public String deleteLec(Long LectureNo) {
		lectureService.deleteByLectureNo(LectureNo);
		return "redirect:/board/main";
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
	 * 강의 상세조회
	 * 
	 * @param lectureNo
	 * @param userNo
	 *
	@RequestMapping("/admin/LectureDetail")
	public void selectLec(Long lectureNo,Model model,Long userNo) {
		LectureResponseDTO dto = lectureService.selectByLectureNo(lectureNo);
		
		//헤이 가이즈~~ 이거 시큐리티 되면 수정해 주이소 
	    int likesConfirm=likeService.selectLike(11L,3L);
		
		model.addAttribute("lecture", dto);
		model.addAttribute("confirm", likesConfirm);
	}
	*/

	
	@RequestMapping("/d")
	public void selectLike() {
		System.out.println(11);
		}
	
	


}// Class LectureController 끝
