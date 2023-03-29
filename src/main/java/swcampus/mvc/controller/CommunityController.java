package swcampus.mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import swcampus.mvc.domain.Community;
import swcampus.mvc.dto.CommunityDTO;
import swcampus.mvc.dto.CommunityResponseDTO;
import swcampus.mvc.dto.ReplyResponseDTO;
import swcampus.mvc.service.CommunityService;

@Controller
@RequiredArgsConstructor
public class CommunityController {
	
	private final CommunityService communityService;
	
	@RequestMapping("/community/list")
	public List<CommunityResponseDTO> commList(String category){
		List<CommunityResponseDTO> list=communityService.communityList(category);
		 return list;
		 
	}
	
	@RequestMapping("/community/insert")
	public String insert(CommunityDTO communityDTO){
		communityService.insertCommunity(communityDTO);
		return "redirect:/community/list";
				
	}
	
	@RequestMapping("/community/update")
	public void update(CommunityDTO communityDTO){
		communityService.updateCommunity(communityDTO);
		System.out.println("컨트롤러 "+communityDTO);
	}
	
	@RequestMapping("/community/delete")
	public void delete(Long commNo){
		communityService.deleteCommunity(commNo);
	}
	
	@RequestMapping("/community/read/{cno}")
	public void read(@PathVariable Long cno  ) {
		
		CommunityResponseDTO dbCommunity=communityService.selectByCommunityId(cno,true);
		List<ReplyResponseDTO> replyList=dbCommunity.getReplyList();
		System.out.println("컨트롤러에서 dbCommunity"+dbCommunity);
		System.out.println("컨트롤러에서 replyList"+replyList);
		//communityService.countUpdate(cno);


		//model.addAttribute("replyList", replyList);
		//model.addAttribute("community", dbCommunity);
		
	}
}
