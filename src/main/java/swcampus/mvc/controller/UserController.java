package swcampus.mvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import swcampus.mvc.config.auth.PrincipalDetails;
import swcampus.mvc.dto.user.UserRequestDTO;
import swcampus.mvc.service.UserService;

@Controller
@RequiredArgsConstructor
public class UserController {
	private final UserService userService;
	
	@RequestMapping("/user/join")
	public void userJoin(UserRequestDTO userDTO) {
		userService.userJoin(userDTO);
	}
	
	@RequestMapping("/user/userDelete")
	public void userDelete(Long userNo) {
		
	}
	
	@RequestMapping("/utill/login")
	public String loginForm(HttpSession session, @AuthenticationPrincipal PrincipalDetails userDetails) {
		//System.out.println("확인: " + SecurityContextHolder.getContext().getAuthentication().isAuthenticated()); 
		System.out.println("로컬스토리지 보낸거야??"+ SecurityContextHolder.getContext());
		PrincipalDetails user = userDetails;
		//System.out.println("session 값 : " + session.getAttribute("JWT_TOKEN"));
		if(user != null) {
			System.out.println("현 사용자: " + userDetails.getUser());
			return "redirect:/";
		}
		
		return "utill/login";
	}
	
}
