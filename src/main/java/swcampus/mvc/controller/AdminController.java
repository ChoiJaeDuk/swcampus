package swcampus.mvc.controller;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.page.PageRequestDTO;
import swcampus.mvc.dto.page.PageResponseDTO;
import swcampus.mvc.dto.user.UserResponseDTO;
import swcampus.mvc.service.UserService;
@Controller
@RequiredArgsConstructor
public class AdminController {
	
	private final UserService userService;
	
	@RequestMapping("/admin/{url}") public void admin() {}
	
	
	@RequestMapping("/admin/userList")
	public Model userList(Model model, @RequestParam(defaultValue ="1") int nowPage) {
		PageRequestDTO pageRequestDTO = new PageRequestDTO(nowPage,10);
		
		PageResponseDTO<UserResponseDTO, User> userList = userService.selectUserList(pageRequestDTO);
		
		model.addAttribute("userList", userList);
		model.addAttribute("nowPage", nowPage);
		return model;
	}
	
	@RequestMapping("/admin/userDetails/{userNo}")
	public String userDetails(Model model, @PathVariable Long userNo) {
		System.out.println("userNo = " + userNo);
		UserResponseDTO user = userService.userSelectById(userNo);
		
		System.out.println("user 정보 : "+ user);
		model.addAttribute("user",user);
		
		return "admin/userDetails";
	}
}
