package com.t4u.crm.dao.tsp;

import java.util.List;

import com.t4u.crm.bean.Region;
import com.t4u.crm.bean.User;

public interface TspRegionDAO {

	public Region getRegion(int id);
	public List getRegionListByUser(User user);

}
