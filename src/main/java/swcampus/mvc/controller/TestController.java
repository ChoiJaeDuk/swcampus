package swcampus.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import swcampus.mvc.dto.LectureResponseDTO;
import swcampus.mvc.dto.LikesDTO;
import swcampus.mvc.service.LectureService;
import swcampus.mvc.service.LikesService;
@Controller
@RequestMapping
public class TestController {
	@Autowired
	private LectureService lecService;
	
	@Autowired
	private LikesService likeService;

	   @RequestMapping("/")
	   public String index(Model model) {
	      System.out.println("HomeController의 index.....");
	      List<LectureResponseDTO> mainList=  lecService.selectAll();
	      System.out.println("1111");
	      //임의값 
	      int likesConfirm=likeService.selectLike(7L,3L);
	      System.out.println(likesConfirm);
	      //임의값 
	      
	      System.out.println("여기오니");
	      model.addAttribute("mainList", mainList);
	      model.addAttribute("likesConfirm", likesConfirm);
	      
	      //임의값-시큐리티 들어오면 로그인한 유저 정보 전달로 바꿔야됨
	      model.addAttribute("user", 3L);
	      return "/main";//
	   }
	   
//	   @RequestMapping("/login")
//	   public void login(String username, String password) {
//		   System.out.println(username);
//		   System.out.println(password);
//	   }
		/*
		 * @RequestMapping("/details/{url}") public void url() {}
		 * 
		 * @RequestMapping("/board/{url}") public void board() {}
		 * 
		 * @RequestMapping("/utill/{url}") public void utill() {}
		 * 
		 * @RequestMapping("/insertForm/{url}") public void insertForm() {} }
		 */
	   @RequestMapping("/utill/{url}") public void url() {}
	   @RequestMapping("/mypage/{url}") public void mypage() {}
	   @RequestMapping("/details/{url}") public void details() {}
	   @RequestMapping("/admin/{url}") public void admin() {}
	   
	   @RequestMapping("/api/v1/manager/")
	   @ResponseBody
	   public String securityTest() { 
		   return "<h1>reports</h1>";
	   }
}
