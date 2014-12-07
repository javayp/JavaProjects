package com.fit.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;

import com.fit.Model.Exercise;
@Controller
public class ExerciseTrackController {
	@RequestMapping(value="/exercisetracker")
	public String addInfo(@ModelAttribute ("exercise") Exercise exercise,Model model){
		StringBuilder builder=new StringBuilder();
		builder.append(exercise.getName()+" "+exercise.getEmployeeId()+" "+exercise.getAge()+" "+exercise.getDepartment());
		model.addAttribute("info", builder);
		return "exerciseTracker";	
	}
}
