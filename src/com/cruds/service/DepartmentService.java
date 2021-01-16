package com.cruds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.db.DepartmentDAO;
import com.cruds.entity.Department;

@Service
public class DepartmentService {

	@Autowired
	DepartmentDAO departmentDao;
	
	public boolean create(Department d)
	{
		return departmentDao.create(d);
	}
	
	public Department get(int deptid)
	{
		return departmentDao.get(deptid);
	}
	
	public List<Department> listDepartment()
	{
		return departmentDao.listDepartment();
		
	}
	
}
