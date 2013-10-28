package com.t4u.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t4u.bean.UserRole;
import com.t4u.security.dao.RoleDAO;



// Referenced classes of package com.telemetica.crm.security.service:
//            RoleService

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDAO roleDAO;
	
	public void setRoleDAO(RoleDAO roleDAO) {
		this.roleDAO = roleDAO;
	}

	public RoleServiceImpl() {
	}

	public UserRole getRole(int id) {
		return roleDAO.getRole(id);
	}
}
