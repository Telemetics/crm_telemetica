package com.t4u.crm.security.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.t4u.crm.bean.User;
import com.t4u.crm.security.dao.UserDAO;


public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserDAO userDAO;
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public CustomUserDetailsService() {
	}

	public void setPasswordEncoder(ShaPasswordEncoder passwordEncoder) {
	}

	public UserDetails loadUserByUsername(String login)
			throws UsernameNotFoundException {
		User domainUser = userDAO.getUser(login);
		System.out.println(login);
		boolean enabled = true;
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;
		org.springframework.security.core.userdetails.User  user = new org.springframework.security.core.userdetails.User(domainUser.getUserName(),
				domainUser.getPassword(), enabled, accountNonExpired,
				credentialsNonExpired, accountNonLocked,
				getAuthorities(domainUser));
		user.getAuthorities();
		return user;
	}

	public Collection<SimpleGrantedAuthority> getAuthorities(User user) {
		List<SimpleGrantedAuthority> authList = getGrantedAuthorities(getRoles(user));
		return authList;
	}

	public List<String> getRoles(User user) {
		List<String> roles = new ArrayList<String>();
		roles.add(user.getUserRole().getUserRole().toString());
		return roles;
	}

	public static List<SimpleGrantedAuthority> getGrantedAuthorities(List<String> roles) {
		List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		String role;
		for (Iterator<String> iterator = roles.iterator(); iterator.hasNext(); authorities
				.add(new SimpleGrantedAuthority(role))) {
			role = (String) iterator.next();
		}

		return authorities;
	}
}
