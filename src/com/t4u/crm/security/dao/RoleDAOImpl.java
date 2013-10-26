package com.t4u.crm.security.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.t4u.crm.bean.UserRole;


// Referenced classes of package com.telemetica.crm.security.dao:
//            RoleDAO
@Repository
public class RoleDAOImpl implements RoleDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public RoleDAOImpl() {
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public UserRole getRole(int id) {
		UserRole role = (UserRole) getCurrentSession().load(UserRole.class,
				Integer.valueOf(id));
		System.out.println("RoleDAOImpl.getRole()");
		System.out.println(role);
		return role;
	}
}
