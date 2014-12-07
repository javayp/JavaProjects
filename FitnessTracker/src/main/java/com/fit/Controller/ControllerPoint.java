package com.fit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerPoint {
	@RequestMapping(value="/greeting")
	public String greetings(Model model){
		model.addAttribute("greeting", "Greetings From Controller");
		return "hello";
	} 
	
	//Below method shows alternative way of returning the view
	@RequestMapping(value="/alternteview")
	public ModelAndView alternate(){
		ModelAndView model=new ModelAndView("alternate");
		model.addObject("alternateview","Hello i am alternate view");
		return model;
	} 
	
	//in the below method we are using the new annotation called path variable which is in-turn used to represent the user input.
	//To achieve  the PATH variable motto we use curly braces around to specify that the input van be anything
	@RequestMapping(value="/pathVariable/{input1}/{input2}")
	public String pathvariable(@PathVariable("input1") String userinput1,@PathVariable("input2") String userinput2,Model model){
		model.addAttribute("pathvaraible","name="+userinput1+" "+"order-id="+userinput2);
		return "pathvariable";
	}
}
