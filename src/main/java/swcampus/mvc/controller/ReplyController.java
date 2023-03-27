package swcampus.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import swcampus.mvc.dto.CommunityResponseDTO;
import swcampus.mvc.dto.ReplyDTO;
import swcampus.mvc.service.CommunityService;
import swcampus.mvc.service.ReplyService;

@Controller
public class ReplyController {

	@Autowired
	private ReplyService replyService;
	
	@Autowired
	private CommunityService commService;
	
	@RequestMapping("/reply/insert")
	public ModelAndView insertReply(ReplyDTO dto) {
		CommunityResponseDTO dbCommunity=commService.selectByCommunityId(dto.getCommunityNo(), false);
		replyService.insertReply(dto);
		return new ModelAndView("community/read","community",dbCommunity);
		
	}
	
	@RequestMapping("/reply/delete")
	public String deleteReply(Long communityNo) {
		replyService.deleteReply(communityNo);
		return "redirect:/community/list";
	}

}
