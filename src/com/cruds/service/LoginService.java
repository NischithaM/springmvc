package com.cruds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.db.LoginDAO;
import com.cruds.entity.User;

@Service
public class LoginService {

	@Autowired
	LoginDAO logindao;
	
	/*public User userlogin(String username,String password)
	{
		return logindao.userlogin(username, password);
	}
	*/
	
	public User userlogin(User u)
	{
		return logindao.userlogin(u);
	}
}
