package swcampus.mvc.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import swcampus.mvc.domain.Lecture;
import swcampus.mvc.domain.Likes;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.LectureDTO;
import swcampus.mvc.service.LectureService;

@Controller
public class LectureController {
	
	@Autowired
	private LectureService lectureService;

	
	/**
	 * 강의등록 폼 열기
	 */
    @RequestMapping("/lectureInsertForm")
	public void lectureInsertForm(LectureDTO lectureDto) {
    
    }
    
    /**
     * 강의등록하기
     * */
    @RequestMapping("/lectureInsert")
    public String lectureInsert(LectureDTO lectureDto) {
    	lectureService.insertLecture(lectureDto);
    	System.out.println("컨트롤러에서 "+lectureDto);
        return "";
    }
    /**
     * 수정하기 폼 열기
     * 
     */
    @RequestMapping("/lectureUpdateForm")
	public void lectureUpdateForm(Long lectureNo,Model model) {
    	Lecture dblecture=lectureService.selectByLectureNo(lectureNo);
		
		model.addAttribute("dblecture", dblecture);
	}
	/**
	 * 강의 수정하기
	 */
	/*
	 * @RequestMapping("/lectureUpdate") public ModelAndView lectureUpdate(Lecture
	 * lecture) {
	 * 
	 * Lecture dblecture=lectureService.updateLecture(lecture);
	 * 
	 * 
	 * return new ModelAndView("question/noticeDetail", "noticeDetail",dblecture); }
	 */
	
	/**
	 * 게시글 삭제하기
	 * */
    @RequestMapping("")
	public String delete(Long LectureNo) {
		lectureService.deleteByLectureNo(LectureNo);
		return "";
	}

}// Class LectureController 끝
