package com.t4u.dao.entitydao;

import java.util.List;

import com.t4u.bean.Area;
import com.t4u.bean.Region;
import com.t4u.bean.User;

public interface AreaDAO {
	
	public List<Area> getAreas();
	public Area getArea(int id);
	public List<Area> getAreas(Region region);
	public Area getArea(User createdUser);

}
