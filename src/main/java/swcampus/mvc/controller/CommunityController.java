package swcampus.mvc.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@Autowired
	private CommunityService communityService;
	
	@RequestMapping("/board/{url}")
	public void commList(String category, Model model){
		List<CommunityResponseDTO> list=communityService.communityList(category);
		System.out.println(list);
		model.addAttribute("list", list);
		 
	}
	
	@RequestMapping("/insertForm/boardInsert")
	public void insertForm(Model model) {
		//유저 정보 추가 
		
	}
	
	@RequestMapping("/board/insert")
	public String insert(CommunityDTO communityDTO, String boardType){
		
		System.out.println(boardType);//codeBoard
		
		communityService.insertCommunity(communityDTO);
		String ca=communityDTO.getCommunityCategory();
		return "redirect:/board/"+boardType+"?category="+ca;
				
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
	
	@RequestMapping("/board/boardDetails")
	public void read(Long communityNo,Model model ) {
		
		CommunityResponseDTO dbCommunity=communityService.selectByCommunityId(communityNo,true);
		List<ReplyResponseDTO> replyList=dbCommunity.getReplyList();
		//communityService.countUpdate(communityNo);


		model.addAttribute("replyList", replyList);
		model.addAttribute("community", dbCommunity);
		
	}
}
