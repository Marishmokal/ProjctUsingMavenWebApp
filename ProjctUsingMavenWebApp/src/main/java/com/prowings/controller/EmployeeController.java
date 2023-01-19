package com.prowings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.prowings.model.Employee;
import com.prowings.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/createNewEmployee", method = RequestMethod.POST)
	public String createEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.createEmployee(employee);
		return "EmployeeView";
	}

	@RequestMapping(value = "/deleteEmp", method = RequestMethod.POST)

	public String deleteEmployee(@ModelAttribute("id") int id) {
		try {
			employeeService.deleteEmployee(id);
		} catch (Exception e) {
			System.out.println("employe deleted");
		}
		return "EmployeeDe";
	}

	@RequestMapping(value = "/updateEmp", method = RequestMethod.POST)
	public String updateEmloyee(@ModelAttribute("employee") Employee employee) {
		try {
			employeeService.updateEmployee(employee);

		} catch (Exception e) {
			System.out.println("employe updated");
		}
		return "EmployeeUp";

	}

	@RequestMapping(value = "/retriveEmployee", method = RequestMethod.POST)
	public ModelAndView retriveEmployee(@ModelAttribute("id") int id) {
		
		Employee e=employeeService.retriveEmployee(id);
		ModelAndView mv=new ModelAndView();
		mv.addObject(e);
		mv.setViewName("EmployeeRetrive");
		return mv ;
		

	

	}

}