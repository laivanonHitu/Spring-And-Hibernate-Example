package com.laivanon.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value = { "/", "/home" })
	public ModelAndView homePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
}
