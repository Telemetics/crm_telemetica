package com.t4u.crm.services.tsp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t4u.crm.bean.Customer;
import com.t4u.crm.bean.User;
import com.t4u.crm.dao.tsp.TspCustomerDAO;
import com.t4u.crm.util.PropertiesMapConverter;

@Service
public class TspCustomerServiceImpl implements TspCustomerService{

	@Autowired
	TspCustomerDAO teCustomerDAO;
	
	
	@Override
	public void addCustomer(Customer customer) {
		customer.setArea(null);
		customer.setRegion(null);
		teCustomerDAO.addCustomer(customer);
	}

	@Override
	public void updateCustormer(Customer customer) {
		teCustomerDAO.updateCustomer(customer);
		
	}
	

	@Override
	public List getCustomersByUser(User user) {
		List customerList = null;
		customerList = teCustomerDAO.getCustomersByUser(user);
		customerList = PropertiesMapConverter.convert(new String[]{"name","type"}, customerList);
		return customerList;
	}
	
}
