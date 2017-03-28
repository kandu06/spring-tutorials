package com.fitness.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.fitness.model.Goal;

@Controller
@SessionAttributes(names="goal") //adds goal object to session.
public class GoalController {
	
	@RequestMapping(value="addGoal", method=RequestMethod.GET)
	public String addGoal(Model model){
		Goal goal=new Goal();
		goal.setMinutes(10); //set the default value here. When the url is hit by default 10 will be shown.
		model.addAttribute("goal", goal);
		return "addGoal";
	}

	@RequestMapping(value="addGoal", method=RequestMethod.POST)
	public String updateGoal(@Valid @ModelAttribute("goal") Goal goal, BindingResult result){ //@Valid tells to run validation and the results of the validation is returned in BindingResult object.
		
		if(result.hasErrors()){
			return "addGoal"; //uses Internal Resource View Resolver.
		}
		
		return "redirect:addMinutes.html";
	}

}
