package com.t4u.crm.dao.tsp;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.t4u.crm.bean.Region;

@Repository
public class TspRegionDAOImpl implements TspRegionDAO{

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
	public Region getRegion(int id) {
		Region region = null;
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			region = (Region) session.load(Region.class, id);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return region;
	}

}
