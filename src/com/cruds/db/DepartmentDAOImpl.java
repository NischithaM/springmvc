package com.cruds.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cruds.entity.Department;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public boolean create(Department d) {
		String sql="insert into department(deptid,deptname) values(?,?)";
		int rows = jdbcTemplate.update(sql,new Object[]{d.getId(),d.getName()});
		return rows > 0;
	}
	
	
	class DeptRowMapper implements RowMapper<Department>
	{
			@Override
		public Department mapRow(ResultSet rs, int arg1) throws SQLException {
			Department d=new Department();
			d.setId(rs.getInt(1));
			d.setName(rs.getString(2));
			return d;
		}

	}
	
	public Department get(int deptId)
	{
		String sql="select * from department where deptId=?";
		Department d=jdbcTemplate.queryForObject(sql, new Object[]{deptId},new DeptRowMapper());
				
		return d;
		
	}


	@Override
	public List<Department> listDepartment() {
		String sql="select deptid,deptname from department";
		List<Department> list=jdbcTemplate.query(sql,new DeptRowMapper());
		System.out.println(list);
		return list;
	}
	
	

}
