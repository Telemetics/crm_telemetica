package com.t4u.crm.services.tsp;

import java.util.List;

import com.t4u.crm.bean.Account;
import com.t4u.crm.bean.Customer;
import com.t4u.crm.bean.User;
import com.t4u.crm.bean.Vertical;

public interface TspAccountService {
	
	public boolean checkForAccount(Customer customer);

	public boolean createAccount(Vertical vertical,User user );

	public List<Account> getAccountsByCustomerId(Customer customer);

}
