package com.t4u.services.tsp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t4u.bean.User;
import com.t4u.crm.util.PropertiesMapConverter;
import com.t4u.dao.tsp.TspRegionDAO;

@Service
public class TspRegionServiceImpl implements TspRegionService{
	
	@Autowired
	TspRegionDAO tspRegionDAO;

	@Override
	public List getRegionListByUser(User user) {
		List regionList = null;
		regionList = tspRegionDAO.getRegionListByUser(user);
		regionList = PropertiesMapConverter.convert(new String[]{"regionId", "regionName","regionPincod"}, regionList);
		return regionList;
	}

}
