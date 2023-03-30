package swcampus.mvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import swcampus.mvc.service.LikesService;

public class LikeController {
	
	@Autowired
	private LikesService likeService;
	

	/**
	 * 등록
	 */
	@RequestMapping("/like/insert")
	@ResponseBody
	public String insert(@RequestBody Map<String, Object> result) {

		  long userNo = (long)Integer.parseInt((String) result.get("userNo"));		  
		  long LectureNo = (long)Integer.parseInt((String) result.get("lectureNo"));
		
		  
		  
		  return null;
		  
	}

	/**
	 * 삭제 - 토글
	 */
	@RequestMapping("/like/delete")
	@ResponseBody
	public String delete(@RequestBody Map<String, Object> result) {
//		
		long userNo = (long)Integer.parseInt((String) result.get("userNo"));		  
		  long gatherNo = (long)Integer.parseInt((String) result.get("gatherNo"));
		
		  likeService.deleteLike(gatherNo, userNo);

		return "";
	}
	
	/**
	 * 삭제 - 버튼
	 */
	@RequestMapping("/like/deleteButton")
	@ResponseBody
	public String delete(Long gatherNo, Long userNo) {
		//long userNo = (long)Integer.parseInt((String) result.get("userNo"));		  
		//long gatherNo = (long)Integer.parseInt((String) result.get("gatherNo"));
		
		likeService.deleteLike(gatherNo, userNo);

		return "";
	}


}
