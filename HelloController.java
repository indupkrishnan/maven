package com.itp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = "/hello")
	public String sayHello() {
		return "hello"; // view Name
	}

	
	
	@RequestMapping(value = "/welcome")
	public ModelAndView welcome() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("welcome");
		
		//db call & get the data.
		modelAndView.addObject("msg", "Welcome to Spring MVC Application");
		return modelAndView;
	}
}

