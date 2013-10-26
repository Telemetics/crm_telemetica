package com.t4u.crm.dao.tsp;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.t4u.crm.bean.Customer;
import com.t4u.crm.bean.User;

@Repository
public class TspCustomerDAOImpl implements TspCustomerDAO{

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	private List getResultListByHql(String hql){
		List customerList = null;
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			Query query = session.createQuery(hql);
			customerList = query.list();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return customerList;
	}

	@Override
	public void addCustomer(Customer customer) {
		Session session = getSession();	
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			session.save(customer);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public void updateCustomer(Customer customer) {
		Session session = getSession();	
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			session.update(customer);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public void deleteCustomer(Customer customer) {
		Session session = getSession();	
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			session.delete(customer);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public List getCustomerByName(String name) {
		List custometList = null;
		custometList = getResultListByHql("from Customer as cus where cus.customerName like'"+name+"%'");
		return custometList;
	}


	@Override
	public List getCustomersByUser(User user) {
		List areaList = null;
		areaList = getResultListByHql("select customerName, customerType from Customer as c where c.createdUser.userId="+user.getUserId());
		return areaList;
	}
	
	
	

	

}
