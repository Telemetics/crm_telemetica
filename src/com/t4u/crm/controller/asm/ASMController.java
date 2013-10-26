package com.t4u.crm.controller.asm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/telemetica/asm/")
public class ASMController {

	public ModelAndView home(){
		ModelAndView modelAndView = null;
		
		modelAndView = new ModelAndView("");
		
		return modelAndView;
	}
	
}
