package com.fit.controllerTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fit.ModelTest.Exercise;

@Controller
public class ModelAttributeController {
	
	/*Exercise exerciseValue;
	
	@ModelAttribute()
	public void populateObject(){
	 exerciseValue=new Exercise();
	}*/
	//we can instantiate the user object by following the above procedure or by just
	//as a parameter
	
	//GET - Requests data from a specified resource
	@RequestMapping(value="/testModelAttr", method=RequestMethod.GET)
	public String takeformRequest(Model model,Exercise exerciseValue){
		model.addAttribute("inputForm",exerciseValue);
		return "testModelAttribute";
	}
	
	//POST - Submits data to be processed to a specified resource
	
	//the action attribute tells the browser to send the form data to a
	// @RequestMapping(value="/testModeld"
	
	@RequestMapping(value="/testModeld",method = RequestMethod.POST)
	public String display(@ModelAttribute("inputForm") Exercise exerciseValue,Model model1){
		model1.addAttribute("infoDisplay",exerciseValue.getName());
		return "testModelDispaly";
	}
}
