package com.t4u.dao.entitydao;

import java.util.List;

import com.t4u.bean.Region;
import com.t4u.bean.User;

public interface RegionDAO {

	public Region getRegion(int id);
	public List<Region> getRegions();
}
