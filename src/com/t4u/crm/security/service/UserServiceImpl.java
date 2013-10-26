package com.t4u.crm.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t4u.crm.bean.User;
import com.t4u.crm.security.dao.UserDAO;



// Referenced classes of package com.telemetica.crm.security.service:
//            UserService
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public UserServiceImpl() {
	}

	public User getUser(String login) {

		return userDAO.getUser(login);
	}
}
