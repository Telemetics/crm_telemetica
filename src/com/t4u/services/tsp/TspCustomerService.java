package com.t4u.services.tsp;

import java.util.List;

import com.t4u.bean.Customer;
import com.t4u.bean.User;

public interface TspCustomerService {
	
	public void addCustomer(Customer customer);
	public void updateCustormer(Customer customer);
	public List getCustomersByUser(User user);

}
