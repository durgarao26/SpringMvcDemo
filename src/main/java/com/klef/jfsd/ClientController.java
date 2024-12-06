package com.klef.jfsd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientController 
{
	@GetMapping(path="/demo1")
	public ModelAndView demo1()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("demo1");
		return mv;
		
	}

}
