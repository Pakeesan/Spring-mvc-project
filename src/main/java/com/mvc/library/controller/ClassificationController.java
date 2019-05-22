package com.mvc.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.library.Service.ClassificationService;
import com.mvc.library.model.Classification;

@Controller
public class ClassificationController {
	
	@Autowired
	public ClassificationService classificationService;
	
	@RequestMapping(value="/" ,method=RequestMethod.GET)
	public String printWelcome(Model model) {
		model.addAttribute("classification", new Classification());
		return "AddClassification";
	}
	@RequestMapping(value="/save" ,method=RequestMethod.POST)
	public String save(@ModelAttribute("classification")Classification classification) {
		classificationService.createClassification(classification);
		return null;
		
	}

}
