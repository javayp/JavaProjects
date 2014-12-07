package com.fit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import com.fit.Model.User;

@Controller
public class RegisterController{
	User uservalue;

	//Model Attribute is always executed first no matter how many controllers are present
	@ModelAttribute("value")
	public void userpopulate(){
		uservalue=new User();
	}

	//GET - Requests data from a specified resource
	@RequestMapping(value = "/register",method = RequestMethod.GET)
	public String viewRegistration(Model model) { 
		model.addAttribute("userForm", uservalue);
		//UserForm Name of the model attribute under which the form object is exposed. Defaults to 'command'.
		return "Registration";
	}
	
	//POST - Submits data to be processed to a specified resource
	@RequestMapping(value="/submission",method = RequestMethod.POST)
	public String processRegistration(@ModelAttribute("userForm") User user,Model model) {
		model.addAttribute("userForm", uservalue);
		System.out.println("username: " + user.getUsername());
		System.out.println("email: " + user.getEmail());

		return "RegistrationSuccess";
	}
}