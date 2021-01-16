package com.cruds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cruds.entity.Book;
import com.cruds.entity.User;
import com.cruds.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginservice;


	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String showUserForm(Model model)
	{
		return "login";
	}


	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String doUserForm(@ModelAttribute("user")User u )
	{
		User dbUser = loginservice.userlogin(u);
		if( dbUser != null)
		{
			return "success";
		}
		else
		{
			return "login";
		}
	}
	
}
