package com.t4u.services.tsp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t4u.bean.User;
import com.t4u.dao.entitydao.RegionDAO;
import com.t4u.util.PropertiesMapConverter;

@Service
public class TspRegionServiceImpl implements TspRegionService{
	
	@Autowired
	RegionDAO regionDAO;

	/*@Override
	public List getRegions(User user) {
		List regionList = null;
		regionList = 
		regionList = PropertiesMapConverter.convert(new String[]{"regionId", "regionName","regionPincod"}, regionList);
		return regionList;
	}*/

}
