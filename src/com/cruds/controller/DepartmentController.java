package com.cruds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cruds.entity.Department;
import com.cruds.service.DepartmentService;

@Controller
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;

	@RequestMapping(value="/department",method=RequestMethod.GET)
	public String showDeptForm(Model model)
	{
		model.addAttribute("command", new Department());
		return "dept";
	}
	

	@RequestMapping(value="/listdept",method=RequestMethod.GET)
	public String showlistDepartment(Model model)
	{
		model.addAttribute("DEPT_LIST", departmentService.listDepartment());
		return "deptlist";
	}
	
	@RequestMapping(value="/dept",method=RequestMethod.GET)
	public String showDept(Model model)
	{
		model.addAttribute("DEPT_LIST_iD", departmentService.get(1));
		return "deptidlist";
	}
	
	@RequestMapping(value="/department",method=RequestMethod.POST)
	public String doDeptForm(@ModelAttribute("department") Department d)
	{
		System.out.println(d.getId() + ":" + d.getName());
		departmentService.create(d);
		return "success";
	}	
	
	
/*	@RequestMapping(value="/department",method=RequestMethod.POST)
	public String doDeptForm(@RequestParam("deptId") String id,
								@RequestParam("deptName") String name)
	{
		System.out.println(id + ":" + name);
		return "success";
	}*/
	
}
