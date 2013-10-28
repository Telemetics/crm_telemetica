package com.t4u.security.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

public class CustomSimpleUrlAuthenticationSuccessHandler extends
		SimpleUrlAuthenticationSuccessHandler {

	public CustomSimpleUrlAuthenticationSuccessHandler() {
	}

	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		HttpSession session = request.getSession(false);
		setAlwaysUseDefaultTargetUrl(true);
		User user = (User) authentication.getPrincipal();
		System.err.println(user);
		com.t4u.bean.User myUser = new com.t4u.bean.User();
		myUser.setUserName(user.getUsername());
		session.setAttribute("currentUser", myUser);
		super.onAuthenticationSuccess(request, response, authentication);
	}
}
