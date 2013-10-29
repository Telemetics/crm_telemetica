package com.t4u.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("currentUser")
public class LoginController {

	@RequestMapping(value="/loginPage.do", method = RequestMethod.GET)
	public ModelAndView goLogin(){
		return new ModelAndView("general/Login"); 
	}

	/*@RequestMapping(value="/login.do", method=RequestMethod.POST) 
	public ModelAndView login(@ModelAttribute Login login){
		ModelAndView modelAndView = null;

		modelAndView = new ModelAndView("general/Home");

		return modelAndView;
	}*/
	
}
