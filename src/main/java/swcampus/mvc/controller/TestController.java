package swcampus.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TestController {

	   @RequestMapping("/")
	   public String index() {
	      System.out.println("HomeController의 index.....");
	      return "index";//
	   }
}
