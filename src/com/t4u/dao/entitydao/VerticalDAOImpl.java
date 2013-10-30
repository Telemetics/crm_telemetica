package com.t4u.dao.entitydao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.t4u.bean.Vertical;

@Repository
public class VerticalDAOImpl implements VerticalDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	 
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void createVertical(Vertical vertical) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			session.save(vertical);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public Vertical getVertical(int id) {
		Vertical vertical = null;
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			vertical = (Vertical) session.load(Vertical.class, id);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
		
		return vertical;
	}

	@Override
	public void updateVertical(Vertical vertical) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			session.update(vertical);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public List<Vertical> getVerticals(String verticalType) {
		List<Vertical> verticalList = null;
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			Query query = session.createQuery("frome Vertical as v where v.verticalType=?");
			query.setString(0, verticalType);
			verticalList = query.list();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return verticalList;
	}

	@Override
	public List<Vertical> getVerticals() {
		List<Vertical> verticalList = null;
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			Query query = session.createQuery("frome Vertical");
			verticalList = query.list();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return verticalList;
	}
}
