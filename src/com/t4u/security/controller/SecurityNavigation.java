package com.t4u.security.controller;

import java.util.HashMap;
import java.util.Map;

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

		return "general/login"; 
	}

	@RequestMapping("/error.do")
	public @ResponseBody Object invalidLogin(ModelMap map) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("message", "Invalide login..!");
		resultMap.put("success", false);
		map.addAttribute("error", true);
		return resultMap;
	}

	
}
