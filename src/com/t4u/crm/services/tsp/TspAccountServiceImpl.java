package com.t4u.crm.services.tsp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t4u.crm.bean.Account;
import com.t4u.crm.bean.Customer;
import com.t4u.crm.bean.User;
import com.t4u.crm.bean.Vertical;
import com.t4u.crm.dao.tsp.TspAccountDAO;


@Service
public class TspAccountServiceImpl implements TspAccountService{
	@Autowired
	private TspAccountDAO tspDAO;

	public TspAccountDAO getTspDAO() {
		return tspDAO;
	}

	public void setTspDAO(TspAccountDAO tspDAO) {
		this.tspDAO = tspDAO;
	}

	@Override
	public boolean checkForAccount(Customer customer) {
		return tspDAO.checkForAccount(customer);
	}

	@Override
	public boolean createAccount(Vertical vertical,User user ) {
		Account account=new Account();
		account.setActiveFlag(null);
		account.setArea(user.getArea());
		account.setCreatedUser(user.getUserRole().getCreatedUser());
		account.setCreateTimestamp(user.getCreateTimestamp());
		account.setDescription(vertical.getDescription());
		account.setNumberOfVehicles(null);
		account.setOpportunities(null);
		account.setRegion(user.getRegion());
		account.setUpdatedUser(user.getUserRole().getUpdatedUser());
		account.setUpdateTimestamp(user.getUpdateTimestamp());
		return tspDAO.createAccount(account,vertical);
	}

	@Override
	public List<Account> getAccountsByCustomerId(Customer customer) {
		return tspDAO.getAccountsByCustomerId( customer);
	}

}
