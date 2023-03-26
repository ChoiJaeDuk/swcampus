package swcampus.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import swcampus.mvc.dto.ReplyDTO;
import swcampus.mvc.service.ReplyService;

@Controller
public class ReplyController {

	@Autowired
	private ReplyService replyService;
	
	@RequestMapping("/reply/insert")
	public void insertReply(ReplyDTO dto) {
		replyService.insertReply(dto);
	}
	
	@RequestMapping("/reply/delete")
	public void deleteReply(Long communityNo) {
		replyService.deleteReply(communityNo);
	}

}
