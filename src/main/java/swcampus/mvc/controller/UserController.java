package swcampus.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import swcampus.mvc.dto.user.UserRequestDTO;
import swcampus.mvc.service.UserService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
	private final UserService userService;
	
	@RequestMapping("/join")
	public void userJoin(UserRequestDTO userDTO) {
		
	}
}
