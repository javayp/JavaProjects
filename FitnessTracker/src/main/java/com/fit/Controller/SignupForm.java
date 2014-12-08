package com.fit.Controller;

import java.util.ArrayList;
import java.util.List;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fit.Model.SignupData;

@Controller
public class SignupForm {
	
	@RequestMapping(value="/signup")
	public String request(Model model){
		model.addAttribute("SignupData",new SignupData());
		
		List<String> professonallist=new ArrayList<String>();
		professonallist.add("Developer IT");
		professonallist.add("programmer");
		model.addAttribute("professionalList",professonallist);
		return "signupPage";
	}
	
	@RequestMapping(value="/signupCompleted", method=RequestMethod.POST)
	public String response(@ModelAttribute("SignupData") SignupData data){
		return "signupPageDisplay";
	}
}
