package com.t4u.crm.security.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.t4u.crm.bean.User;


// Referenced classes of package com.telemetica.crm.security.dao:
//            UserDAO
@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public UserDAOImpl() {
	}

	private Session openSession() {
		System.out.println("UserDAOImpl.openSession()");
		return sessionFactory.openSession();
	}

	public User getUser(String login) {
		List<User> userList = new ArrayList<User>();
		try {
			Transaction transaction = openSession().beginTransaction();
			Query query = openSession().createQuery(
					"from User where userName =?");
			query.setString(0, login);
			userList = query.list();
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (userList.size() > 0) {
			return (User) userList.get(0);
		} else {
			return null;
		}
	}
}
