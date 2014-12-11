package com.fit.Controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fit.Model.Exercise;
import com.fit.jobList.Department;


@Controller
public class GoalController{
	Exercise exercise;
	List<String> joblist;
	
	//Below method will be called first in all the scenarios since it is annotated with ModelAttribute
	
	@ModelAttribute("populate")
	public void populateObject(Model model){
		
		//It's better to put the job List in the method annotated with @ModelAttribute
		// since it loads all the content and doesn't have to call manually
		//else profession tab  in HTML page will be empty once the page is reloaded due validation error
		
		//if we had made the method getJobList in department as static we would be loading 
		//the list to HTML repeatedly proportional to the no of times page loads
				
		joblist=new Department().getJobList();
		model.addAttribute("designations",joblist);
		exercise=new Exercise();
	}
	@RequestMapping(value="/goalsignup", method=RequestMethod.GET)
	public String goalForm(Model model){
		model.addAttribute("signup",exercise);
		
	
	
		return "goalFormSignup";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String goalcompletedInfo(@Valid @ModelAttribute("signup") Exercise exercise,BindingResult result,Model model){
		if(result.hasErrors()){
			/*joblist=new Department().getJobList();
			model.addAttribute("designations",joblist);*/
			return "goalFormSignup";
		}
		return "goalsSingupDisplay";
	}
}
