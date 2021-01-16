package com.cruds.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cruds.db.DepartmentDAOImpl.DeptRowMapper;
import com.cruds.entity.Department;
import com.cruds.entity.User;

@Repository
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	

	class UserRowMapper implements RowMapper<User>
	{
			@Override
		public User mapRow(ResultSet rs, int arg1) throws SQLException {
			User u=new User();
			u.setUsername(rs.getString(1));
			u.setPassword(rs.getString(2));
			return u;
		}

	}


	@Override
	public User userlogin(User u) {
		String sql="select * from userlogin where username=? and password=?";
		User user = null;
		try
		{
			user=jdbcTemplate.queryForObject(sql, new Object[]{u.getUsername(),u.getPassword()},new UserRowMapper());
		}catch(EmptyResultDataAccessException e)
		{
			System.out.println("No user found");
		}
				
		return user;
	}
	
	
	

	/*@Override
	public User userlogin(String username, String password) {
		String sql="select 1 from userlogin where username=? and password=?";
		User u=jdbcTemplate.queryForObject(sql, new Object[]{username,password},new DeptRowMapper());
				
		return u;
		
	}*/

}
