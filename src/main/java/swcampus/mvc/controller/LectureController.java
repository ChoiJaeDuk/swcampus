package swcampus.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import swcampus.mvc.dto.LectureDTO;
import swcampus.mvc.dto.LectureResponseDTO;
import swcampus.mvc.service.LectureService;

@Controller
public class LectureController {
	
	@Autowired
	private LectureService lectureService;

	
	/**
	 * 강의등록 폼 열기
	 */

    @RequestMapping("/lecture/insertForm")
	public void lectureInsertForm(LectureDTO lectureDto) {
    
    }
    
    /**
     * 강의등록하기
     * */

    @RequestMapping("/lecture/insert")

    public String lectureInsert(LectureDTO lectureDto) {
    	lectureService.insertLecture(lectureDto);
    	System.out.println("컨트롤러에서 "+lectureDto);
        return "";
    }

    // 상세보기
 
    @RequestMapping("/lecture/??")
	public void selectLec(Long lectureNo) {
    	LectureResponseDTO dto =lectureService.selectByLectureNo(lectureNo);
    	
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

    
    /**
     *강의 전체조회
     */
	@RequestMapping("/lecture/list")
	public List<LectureResponseDTO> LectureList(){
		
		 return null;
	}
	
    /**
     *카테고리별 강의 전체조회
     */
//	@RequestMapping("/lecture/list")
//	public List<LectureResponseDTO> LectureListByCa(){
//		
//		 return null;
//	}
	


}// Class LectureController 끝
