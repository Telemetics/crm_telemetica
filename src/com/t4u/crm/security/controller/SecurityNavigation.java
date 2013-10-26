package com.t4u.crm.security.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.t4u.crm.bean.User;

@Controller
public class SecurityNavigation {

	public SecurityNavigation() {
	}

	@RequestMapping("/userlogin.do")
	public String loginForm() {

		return "login";
	}

	@RequestMapping("/error.do")
	public String invalidLogin(ModelMap map) {
		map.addAttribute("error", true);
		return "login";
	}

	public ModelAndView successLogin() {
		return new ModelAndView("success-login");
	}

	@RequestMapping("/test")
	public String test(@Valid User user, BindingResult result) {
		if (result.hasErrors()) {

			return "asm";
		} else {
			return "login";
		}
	}
}
