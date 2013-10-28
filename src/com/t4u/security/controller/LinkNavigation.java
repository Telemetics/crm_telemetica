package com.t4u.security.controller;

import java.util.Collection;
import java.util.Iterator;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.t4u.bean.UserRole;
import com.t4u.constants.ROLES;



@Controller
@RequestMapping("/user")
@SessionAttributes("currentUser")
public class LinkNavigation {
	public LinkNavigation() {
	}

	@RequestMapping("/secure.do") 
	public String giveSecure(ModelMap modelMap) {
		
		SecurityContext context = SecurityContextHolder.getContext();
		
		Authentication authentication = context.getAuthentication();
		
		User user = (User) authentication.getPrincipal();
		Collection<?> authorities = user.getAuthorities();
		Iterator<?> itr = authorities.iterator();
		String role = ((GrantedAuthority) itr.next()).getAuthority();
		com.t4u.bean.User myUser = new com.t4u.bean.User ();
		myUser.setUserName(user.getUsername());
		UserRole role2 = new UserRole();
		myUser.setUserRole(role2);
		modelMap.addAttribute("currentUser", myUser);
		if (role.equals(ROLES.ROLE_ASM.toString())) {
			role2.setUserRole(ROLES.ROLE_ASM.toString());
			return "asm";
		}
		if (role.equals(ROLES.ROLE_RSM.toString())) {
			role2.setUserRole(ROLES.ROLE_RSM.toString());
			return "rsm";
		}
		if (role.equals(ROLES.ROLE_TSP.toString())) {
			role2.setUserRole(ROLES.ROLE_TSP.toString());
			return "ltsp";
		} else {
			return "login";
		}
	}
}
