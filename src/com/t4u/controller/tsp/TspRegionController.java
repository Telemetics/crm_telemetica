package com.t4u.controller.tsp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.t4u.bean.User;
import com.t4u.services.tsp.TspRegionService;

@Controller
@RequestMapping("/tsp")
public class TspRegionController {

	@Autowired
	TspRegionService tspRegionService;
	
	@RequestMapping(value="/getRegionList")
	public @ResponseBody Object getRegionList(){
		Map<String,Object> resultMap = new HashMap<String, Object>();
		User user = new User();
		user.setUserId(1);
		resultMap.put("success", true);
		resultMap.put("data", tspRegionService.getRegionListByUser(user));
		return resultMap;
	}
}
