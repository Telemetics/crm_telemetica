package com.t4u.crm.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.t4u.crm.security.bean.Login;

@Controller
public class LoginController {

	@RequestMapping(value="/loginPage.do", method = RequestMethod.GET)
	public ModelAndView goLogin(){
		return new ModelAndView("general/Login"); 
	}

	@RequestMapping(value="/login.do", method=RequestMethod.POST) 
	public ModelAndView login(@ModelAttribute Login login){
		ModelAndView modelAndView = null;

		modelAndView = new ModelAndView("general/Home");

		return modelAndView;
	}
}
