package com.t4u.dao.tsp;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.t4u.bean.Account;
import com.t4u.bean.Area;
import com.t4u.bean.Region;
import com.t4u.bean.Zone;

@Repository
public class TspAccountDAOImpl implements TspAccountDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addAccount(Account account) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			session.save(account);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public Account getAccoutn(int id) {
		Account account = null;
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			account = (Account) session.load(Account.class, id);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return account;
	}

	@Override
	public void updateAccount(Account account) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			session.update(account);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}		
	}
	
}
