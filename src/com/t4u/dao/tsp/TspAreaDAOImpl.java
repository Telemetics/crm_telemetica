package com.t4u.dao.tsp;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.t4u.bean.Area;

@Repository
public class TspAreaDAOImpl implements TspAreaDAO{
	
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
	public List getAreaList() {
		List areaList = null;
		areaList = getResultListByHql("select areaId, areaName from Area");
		return areaList;
	}
	

	@Override
	public Area getAreaById(int id) {
		Area area = null;
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			area = (Area) session.load(Area.class, id);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return area;
	}

	@Override
	public List getAreaListByRegion(int id) {
		List areaList = null;
		areaList = getResultListByHql("from Area as a where a.region.regionId="+id);
		return areaList;
	}

}
