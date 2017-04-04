package com.fitness.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fitness.model.Activity;
import com.fitness.model.Exercise;
import com.fitness.service.ExerciseService;

@Controller
public class MinutesController {
	
	@Autowired
	private ExerciseService exerciseService;
	
	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@Valid @ModelAttribute("exercise") Exercise exercise, BindingResult result){
		
		System.out.println("exercise: " + exercise.getMinutes());
		System.out.println("exercise activity: " + exercise.getActivity());
		
		//This will use internal view resolver to get the correct view. in this case WEB-INF/jsp/addMinutes.html
		return "addMinutes";
		
		// This will forward the request object and minutes in exercise object will be preserved. 
		// NOTE: .html in the end, it is needed, because it does not use internal view resolver, but goes as a new request and gets resolved in web.xml. 
//		return "forward:addMoreMinutes.html"; 
		
		
		// This will redirect the request to browser and then back to addMoreMinutes.html. Hence the minutes in exercise object is lost.
		// NOTE: .html in the end, it is needed, because it does not use internal view resolver, but goes as a new request and gets resolved in web.xml. 
				
//		return "redirect:addMoreMinutes.html"; 
	}

	@RequestMapping(value = "/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise){
		
		System.out.println("Exercising:"+exercise.getMinutes());
		return "addMinutes";
	}
	
	@RequestMapping(value ="/activities", method =RequestMethod.GET) //spring-mvc/activites.json or spring-mvc/activites.xml
	public @ResponseBody /*means return is the entire response itself, does not go to another view.*/ List<Activity> ListAllActivities(){
		
		return exerciseService.findAllActivities();
	}
	
	
}
