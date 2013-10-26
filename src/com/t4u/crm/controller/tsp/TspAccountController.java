package com.t4u.crm.controller.tsp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.t4u.crm.bean.Account;
import com.t4u.crm.bean.Customer;
import com.t4u.crm.bean.User;
import com.t4u.crm.bean.Vertical;
import com.t4u.crm.services.tsp.TspAccountService;

@Controller
@SessionAttributes("currentUser")
@RequestMapping("/tsp")
public class TspAccountController {
	@Autowired 
	TspAccountService tspService;
	public TspAccountService getTspService() {
		return tspService;
	}
	public void setTspService(TspAccountService tspService) {
		this.tspService = tspService;
	}

	@RequestMapping(value="/acc.do",method=RequestMethod.POST)
	public ModelAndView checkForAccount(@ModelAttribute Customer customer)
	{
		if(tspService.checkForAccount(customer))
		{
			return new ModelAndView("dummy","successkey","Account present!!");
		}
		else
		{
			return new ModelAndView("createaccount","createaccountkey","Account not present!! plz enter the following details!!");
		}
	}

	@RequestMapping(value="/createaccount.do",method=RequestMethod.POST)
	public ModelAndView createAccount(@ModelAttribute Vertical vertical,@ModelAttribute("currentUser") User user)
	{
		System.out.println(vertical.getVerticalName());
		if(tspService.createAccount(vertical,user))
			return new ModelAndView("createaccount","accountcreatedkey","Account created Successfully!!");
		else return new ModelAndView("createaccount","accountcreatedfailurekey","Account could not be created!!");
	}

	@RequestMapping(value="/viewaccountbasedoncustomer.do",method=RequestMethod.POST)
	public ModelAndView getAccountsByCustomerId(@ModelAttribute Customer customer)
	{
		List<Account> accounts=tspService.getAccountsByCustomerId(customer);
		System.out.println(accounts.get(0).getAccountId());
		System.out.println(accounts.get(1).getAccountId());
		return new ModelAndView("customer","accounts", accounts);
	}

}
