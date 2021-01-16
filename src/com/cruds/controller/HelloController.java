package com.cruds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController 
{
	/*@RequestMapping("/hello")
	public ModelAndView sayHello()
	{
		return new ModelAndView("home", "MESSAGE", "Hello Spring MVC");
	}
*/
	@RequestMapping("/hello")
	public String sayHello(Model model)
	{
		model.addAttribute("MESSAGE", "Hello Again From Spring MVC");
		return "home";
	}
}
