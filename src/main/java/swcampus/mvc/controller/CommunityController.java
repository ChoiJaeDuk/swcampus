package swcampus.mvc.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import swcampus.mvc.dto.CommunityDTO;
import swcampus.mvc.dto.CommunityResponseDTO;
import swcampus.mvc.dto.ReplyResponseDTO;
import swcampus.mvc.service.CommunityService;

@Controller
@RequiredArgsConstructor
public class CommunityController {
	
	private final CommunityService communityService;
	
	@RequestMapping("/board/{url}")
	public void commList(String category, Model model){
		List<CommunityResponseDTO> list=communityService.communityList(category);
		model.addAttribute("list", list);
		 
	}
	
	@RequestMapping("/insertForm/boardInsert")
	public void insertForm(Model model) {
		//유저 정보 추가 
		
	}
	
	@RequestMapping("/board/insert")
	public String insert(CommunityDTO communityDTO){
		//System.out.println(communityDTO);
		communityService.insertCommunity(communityDTO);
		String ca=communityDTO.getCommunityCategory();
		return "redirect:/";
				
	}
	
	@RequestMapping("/board/update")
	public void update(CommunityDTO communityDTO){
		communityService.updateCommunity(communityDTO);
		System.out.println("컨트롤러 "+communityDTO);
	}
	
	@RequestMapping("/board/delete")
	public void delete(Long commNo){
		communityService.deleteCommunity(commNo);
	}
	
	@RequestMapping("/board/read/{cno}")
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
