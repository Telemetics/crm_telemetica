package com.t4u.crm.dao.tsp;


import java.util.List;

import com.t4u.crm.bean.Customer;
import com.t4u.crm.bean.User;

public interface TspCustomerDAO {

	public void addCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(Customer customer);
	public List getCustomerByName(String name);
	public List getCustomersByUser(User user);
	
}
