package com.fit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerPoint {
	@RequestMapping(value="/greeting")
	public String greetings(Model model){
		model.addAttribute("greeting", "Hello World");
		return "greeting";
	}
}
