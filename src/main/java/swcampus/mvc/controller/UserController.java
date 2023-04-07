package swcampus.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.jsonwebtoken.Jwt;
import lombok.RequiredArgsConstructor;
import swcampus.mvc.config.auth.PrincipalDetails;
import swcampus.mvc.config.jwt.JwtTokenProvider;
import swcampus.mvc.domain.User;
import swcampus.mvc.dto.user.UserRequestDTO;
import swcampus.mvc.repository.UserRepository;
import swcampus.mvc.service.UserService;

@Controller
@RequiredArgsConstructor
public class UserController {
	private final UserService userService;
	private final UserRepository userRepository;
	private final JwtTokenProvider tokenProvider;
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	
	@RequestMapping("/user/join")
	public void userJoin(UserRequestDTO userDTO) {
		userService.userJoin(userDTO);
	}
	
	@RequestMapping("/user/userDelete")
	public void userDelete(Long userNo) {
		
	}
	
	@RequestMapping("/loginForm")
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
	
	@RequestMapping("/logout")
	public String test(HttpServletRequest request) {
		
		SecurityContextHolder.clearContext();
		//redisTemplate.opsForSet().add("BLACKLIST", request.getHeader("Authorization"));
		// HTTP 요청 헤더에서 JWT 토큰 값을 추출
//	    String token = request.getHeader("Authorization").replace("Bearer ", "");
//	    System.out.println("token : "+ token);
	    // 추출한 JWT 토큰 값으로 인증 정보를 조회
//	    Authentication authentication = tokenProvider.getAuthentication(token);
//	    System.out.println(authentication.getDetails());
	    // 인증된 사용자 정보 조회
	    //User user = userRepository.findByUserId(authentication.getDetails());
	    //System.out.println("user이건가? = " + user);
	    return "redirect:/loginForm";
	}
	
	@RequestMapping("userInfo")
	@ResponseBody
	public PrincipalDetails userInfo(HttpServletRequest request, @AuthenticationPrincipal PrincipalDetails userDetails) {
		
		User user = new User();
		System.out.println("userInfo의 유저 Role = " + userDetails.getUserRole());
		
		return userDetails;
	}
	
}
