package swcampus.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import swcampus.mvc.dto.LikesDTO;
import swcampus.mvc.service.LikesService;

@RestController
public class LikeController {

	@Autowired
	private LikesService likeService;
	
	@RequestMapping("/like/insert")
	public void insertLike(@RequestBody LikesDTO dto) {
		
		likeService.insertLike(dto);
		
	}
	
	@RequestMapping("/like/delete")
	public void deleteLike(@RequestBody LikesDTO dto) {
		
		likeService.deleteLike(dto.getLectureNo(), dto.getUserNo());
		
	}

}
