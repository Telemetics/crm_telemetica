package com.t4u.dao.entitydao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.t4u.bean.Area;
import com.t4u.bean.Region;
import com.t4u.bean.User;

@Repository
public class AreaDAOImpl implements AreaDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	private List<Area> getResultListByHql(String hql){
		List<Area> customerList = null;
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
	public List<Area> getAreas() {
		List<Area> areaList = null;
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			Query query = session.createQuery("from Area");
			areaList = query.list();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return areaList;
	}
	

	@Override
	public Area getArea(int id) {
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
	public List<Area> getAreas(Region region) {
		List<Area> areaList = null;
		areaList = getResultListByHql("from Area as a where a.region.regionId="+region.getRegionId());
		return areaList;
	}

	@Override
	public Area getArea(User createdUser) {
		Area area = null;
		
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			Query query= session.createQuery("from Area as a where a.createdUser.id =?");
			query.setInteger(0, createdUser.getUserId());
		} catch (HibernateException e) {
			transaction.commit();
			e.printStackTrace();
		}
		return area;
	}


}
