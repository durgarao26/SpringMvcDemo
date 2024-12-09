package com.klef.jfsd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientController 
{
	@GetMapping("welcome")
	public ModelAndView display()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("welcome");
		mv.addObject("name", "Welocme");
		return mv;
	}
	
	@GetMapping("test")
	public ModelAndView test()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("test");
		return mv;
	}
	
	@GetMapping("/showinfo")
	@ResponseBody
	public String displayname(@RequestParam("id") int a, @RequestParam("name") String b)
	{
		return a+" "+b;
	}
	
	@GetMapping("calculatesum/{a}/{b}")
	@ResponseBody
	public String calculatesum(@PathVariable("a") int x, @PathVariable("b") int y)
	{
		int z= x+y;
		return Integer.toString(z);
	}
	
	@GetMapping("employeeform")
	public ModelAndView employeeform()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("test");
		return mv;
	}
	
	@GetMapping("/addnumbers")
	@ResponseBody
	public String addnumbers(@RequestParam("a") int num1, @RequestParam("b") int num2)
	{
		int z= num1+num2;
		return Integer.toString(z);
	}
	
	@GetMapping("combine/{fname}/{lname}")
	public ModelAndView show(@PathVariable("fname") String str1, @PathVariable("lname") String str2)
	{
		String z=str1+" "+str2;
		ModelAndView mv=new ModelAndView();
		mv.setViewName("combine");
		mv.addObject("fname",str1.toUpperCase());
		mv.addObject("lname", str2.toUpperCase());
		mv.addObject("name", z.toUpperCase());
		return mv;
		
	}
	
	
	

}
