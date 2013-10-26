package com.t4u.crm.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PropertiesMapConverter {

	public static List convert(String[] propertyList,List<Object[]> valueList){
		List<Object> resultList = new ArrayList<Object>();
		for (Object[] object:valueList) {
			Map singleObject = new HashMap<String, Object>();
			for(int i=0; i<propertyList.length; i++){
				singleObject.put(propertyList[i], object[i]);

			}
			resultList.add(singleObject);
		}
		return resultList;
	}

}
