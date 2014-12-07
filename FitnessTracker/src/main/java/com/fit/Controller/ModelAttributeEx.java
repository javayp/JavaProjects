package com.fit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;

import com.fit.Model.Exercise;

@Controller
public class ModelAttributeEx {
	
	@RequestMapping(value="/modelattribute")
	public String model(@ModelAttribute("intercepter") Exercise value){
		System.out.println(value.getName());
		return "modelattribute";
	}
}
