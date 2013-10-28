package com.t4u.dao.tsp;

import java.util.List;

import com.t4u.bean.Area;

public interface TspAreaDAO {
	
	public List getAreaList();
	public Area getAreaById(int id);
	public List getAreaListByRegion(int id);

}
