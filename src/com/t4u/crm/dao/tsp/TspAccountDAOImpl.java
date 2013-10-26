package com.t4u.crm.dao.tsp;

import java.util.HashSet;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.t4u.crm.bean.Account;
import com.t4u.crm.bean.Customer;
import com.t4u.crm.bean.User;
import com.t4u.crm.bean.Vertical;

@Repository
public class TspAccountDAOImpl implements TspAccountDAO {
	@Autowired
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean checkForAccount(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("select count(*) from Account where customerId=?");
		query.setInteger(0, customer.getCustomerId());
		// Query query =session.createQuery("from Customer where customerId=?");
		/*
		 * query.setInteger(0, customer.getCustomerId()); Customer
		 * customer2=(Customer) query.list().get(0);
		 * 
		 * List<Account> accounts=(List<Account>) customer.getAccounts();
		 */
		List<Long> result = query.list();
		System.out.println(result.get(0));

		if (result.get(0) == 0)
			return false;
		else
			return true;
	}

	@Override
	public boolean createAccount(Account account,Vertical vertical) {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(" from Vertical where verticalName=?");
		query.setString(0, vertical.getVerticalName());
		System.out.println(vertical.getVerticalName());
		Integer integer = null;
		try {
			List<Vertical> verticals= query.list();
			vertical=verticals.get(0);
			account.setVertical(vertical);
			HashSet<Account> accounts=new HashSet<Account>();
			accounts.add(account);
			vertical.setAccounts(accounts);
			session.save(vertical);
			integer = (Integer) session.save(account);
			transaction.commit();
			System.out.println(integer);
		} catch (HibernateException exception) {
			transaction.rollback();
			exception.printStackTrace();
		}
		if (integer == null)
			return false;
		else
			return true;
	}

	@Override
	public List<Account> getAccountsByCustomerId(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(" from Account where customerId=?");
		query.setInteger(0, customer.getCustomerId());
		List<Account> accounts=query.list();
		transaction.commit();
		return accounts;
	}

}
