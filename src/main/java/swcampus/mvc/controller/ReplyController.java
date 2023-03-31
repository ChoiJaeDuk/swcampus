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
	public String insertReply(ReplyDTO dto) {
		CommunityResponseDTO dbCommunity=commService.selectByCommunityId(dto.getCommunityNo(), false);
		
		replyService.insertReply(dto);
		System.out.println(dto);
		
		Long commNo=dbCommunity.getCommunityNo();
		
		//return new ModelAndView("board/boardDetails","community",dbCommunity);
		return "redirect:/board/boardDetails?communityNo="+commNo;
	}
	
	@RequestMapping("/reply/delete")
	public String deleteReply(Long communityNo) {
		replyService.deleteReply(communityNo);
		return "redirect:/community/list";
	}

}
