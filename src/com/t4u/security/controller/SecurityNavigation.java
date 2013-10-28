package com.t4u.security.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.t4u.bean.User;

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
	@RequestMapping("/test")
	public @ResponseBody ModelMap successLogin(@Valid User user,BindingResult result) {
		ModelMap map=new ModelMap();
		if(result.hasErrors()){
			map.addAttribute("errors", result.getAllErrors());
			return map;
		}
		else {
			return null;
		}
	}

	
}
