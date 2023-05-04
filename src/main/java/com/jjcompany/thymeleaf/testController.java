package com.jjcompany.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
	
	@RequestMapping(value = "/hello")
	public String hello(Model model) {
		
		model.addAttribute("data", "helloWorld");
		
		MemberDto dto =new MemberDto("홍씨",15);
		
		model.addAttribute("memberDto", dto);
		return "hello";
	}
	
}
