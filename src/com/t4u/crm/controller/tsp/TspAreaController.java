package com.t4u.crm.controller.tsp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.t4u.crm.services.tsp.TspAreaService;

@Controller
@RequestMapping("/tsp")
//@SessionAttributes("currentUser")
public class TspAreaController {

	@Autowired
	private TspAreaService tspAreaService;

	
	
	@RequestMapping(value="/getAreas")
	public @ResponseBody Object getAreas(){
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("areaList", tspAreaService.getAreaList());
		return resultMap;
	}

}
