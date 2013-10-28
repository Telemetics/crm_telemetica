package com.t4u.controller.tsp;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.t4u.bean.Customer;
import com.t4u.bean.User;
import com.t4u.crm.validators.CustomerValidator;
import com.t4u.services.tsp.TspCustomerServiceImpl;

@Controller
@RequestMapping("/tsp")
//@SessionAttributes("currentUser")
public class TspCustomerController {

	@Autowired
	CustomerValidator customerValidator;
	@Autowired
	TspCustomerServiceImpl tspService;


	@RequestMapping(value="/addCustomer", method=RequestMethod.POST)
	public @ResponseBody Object homePage(@Valid Customer customer, @ModelAttribute("currentUser") User user, BindingResult result) {
		Map<String,Object> resultMap = new HashMap<String,Object>();
		if(result.hasErrors()){
			resultMap.put("properties_error", result.getAllErrors());
		}else{
			tspService.addCustomer(customer);
			resultMap.put("data", customer);
		}
		return resultMap;
	}
	
	@RequestMapping(value="/updateCustomer",method=RequestMethod.POST)
	public @ResponseBody Object updateCustomer(@ModelAttribute Customer customer, @ModelAttribute("currentUser") User user, BindingResult result){
		Map<String,Object> resultMap = new HashMap<String,Object>();
			tspService.updateCustormer(customer);
			resultMap.put("data", customer);
		return resultMap;
	}
	
	@RequestMapping(value="/getCustomers")
	public @ResponseBody Object getCustomers(/*@ModelAttribute("currentUser") User user*/){
		Map<String,Object> resultMap = new HashMap<String,Object>();
		User user = new User();
		user.setUserId(1);
		resultMap.put("data", tspService.getCustomersByUser(user));
		return resultMap;
	}

}
