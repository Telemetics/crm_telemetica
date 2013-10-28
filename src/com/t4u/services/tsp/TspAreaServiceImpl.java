package com.t4u.services.tsp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t4u.dao.tsp.TspAreaDAO;
import com.t4u.util.PropertiesMapConverter;

@Service
public class TspAreaServiceImpl implements TspAreaService{
	
	@Autowired
	private TspAreaDAO tspAreaDAO;
	
	@Override
	public List getAreaList() {
		List AreaList = null;
		AreaList = tspAreaDAO.getAreaList();
		AreaList = PropertiesMapConverter.convert(new String[]{"areaId","areaName"}, AreaList);
		return AreaList;
	}


}
