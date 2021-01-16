package com.cruds.db;

import com.cruds.entity.User;

public interface LoginDAO {

	/*public User userlogin(String username,String password);*/
	
	public User userlogin(User u);
}
