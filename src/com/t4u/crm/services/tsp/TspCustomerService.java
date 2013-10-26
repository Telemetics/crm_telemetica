package com.t4u.crm.services.tsp;

import java.util.List;

import com.t4u.crm.bean.Customer;
import com.t4u.crm.bean.User;

public interface TspCustomerService {
	
	public void addCustomer(Customer customer);
	public void updateCustormer(Customer customer);
	public List getCustomersByUser(User user);

}
