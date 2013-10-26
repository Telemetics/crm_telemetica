package com.t4u.crm.dao.tsp;

import java.util.List;

import com.t4u.crm.bean.Account;
import com.t4u.crm.bean.Customer;
import com.t4u.crm.bean.Vertical;

public interface TspAccountDAO {
	public boolean checkForAccount(Customer customer);

	public boolean createAccount(Account account,Vertical vertical);

	public List<Account> getAccountsByCustomerId(Customer customer);
}
