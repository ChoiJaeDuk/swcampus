package swcampus.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping
public class TestController {

	   @RequestMapping("/")
	   public String index() {
	      System.out.println("HomeController의 index.....");
	      return "/main";//
	   }
	   @RequestMapping("/details/{url}")
	   public void url() {}
}
