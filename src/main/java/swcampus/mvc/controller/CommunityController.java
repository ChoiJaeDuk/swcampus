package swcampus.mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import swcampus.mvc.dto.CommunityDTO;
import swcampus.mvc.dto.CommunityResponseDTO;
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
}
