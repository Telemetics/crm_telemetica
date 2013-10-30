package com.t4u.dao.tsp;

import com.t4u.bean.Account;


public interface TspAccountDAO {

	public void addAccount(Account account);
	public Account getAccoutn(int id);
	public void updateAccount(Account account);
	
	
}
