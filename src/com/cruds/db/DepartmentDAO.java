package com.cruds.db;

import java.util.List;

import com.cruds.entity.Department;

public interface DepartmentDAO {

	public boolean create(Department d);
	
	public Department get(int deptid);
	
	public List<Department> listDepartment();

}
