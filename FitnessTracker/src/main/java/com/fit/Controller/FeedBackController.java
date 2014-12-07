package com.fit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class FeedBackController {
	
	@RequestMapping(value="/feedback",method = RequestMethod.GET)
	protected String acceptTheInfo(){
		return "feedback";
	}
	
	@RequestMapping(value="/submisson",method=RequestMethod.POST)
	protected String submittTheForm(@RequestParam("psm") String name,@RequestParam("age") String age,Model model){
		model.addAttribute("sumittedvalue","name="+name+" "+"age="+age);
		return "submission";
	}
}
