package com.t4u.dao.tsp;

import java.util.List;

import com.t4u.bean.Region;
import com.t4u.bean.User;

public interface TspRegionDAO {

	public Region getRegion(int id);
	public List getRegionListByUser(User user);

}
