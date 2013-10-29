package com.t4u.security.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.t4u.bean.User;
import com.t4u.bean.UserRole;
import com.t4u.constants.ROLES;

@Controller
@SessionAttributes("currentUser")
public class HomeDispatureController {
	
	@RequestMapping("/home.do")
	public String sendHomePage(@ModelAttribute("currentUser") User user){
		
		UserRole userRole = user.getUserRole();
		String role = userRole.getUserRole();
		if (role.equals(ROLES.ROLE_ASM.toString())) {
			return "general/asm";
		}
		if (role.equals(ROLES.ROLE_RSM.toString())) {
			return "general/rsm";
		}
		if (role.equals(ROLES.ROLE_TSP.toString())) {
			Map<String, Object> resultMap = new HashMap<String, Object>();
			resultMap.put("message", "Success..!");
			resultMap.put("success", true);
			return "tsp/home";
		} else {
			return "general/login";
		}
	}

}
