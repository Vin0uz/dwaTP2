package com.example;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	@Inject
	VegetableRep rep;
	
	@RequestMapping(value="/") 
	String Mapping(Model m)
	{
		m.addAttribute("hi", "hellowwww");
		return ("simple");
	}
	
}