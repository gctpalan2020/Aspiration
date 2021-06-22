package Cucumber_Selenium.Cucumber_Selenium.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/helloWorld.do")
	public String todoList(Model model) {
		model.addAttribute("groupId","Cucumber_Selenium");
		model.addAttribute("artifactId","Cucumber_Selenium");
		return "/helloWorld";
	}
}
