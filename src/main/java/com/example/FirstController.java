package com.example;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController {
	@Inject
	VegetableRepository rep;
	
	@RequestMapping(value="/") 
	String Mapping(Model m)
	{
		m.addAttribute("hi", "hellowwww");
		m.addAttribute("veges", rep.findAll());
		m.addAttribute("veg", new Vegetable());
		return ("simple");
	}
	
	@RequestMapping(value="/addvegetable",method=RequestMethod.POST)
	String TotoVegetable(Vegetable veg){
		rep.save(veg);
		return ("redirect:/");
	}
	
	
}