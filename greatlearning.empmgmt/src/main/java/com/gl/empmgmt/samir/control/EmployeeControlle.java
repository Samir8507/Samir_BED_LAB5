package com.gl.empmgmt.samir.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.empmgmt.samir.model.Employee;
import com.gl.empmgmt.samir.service.EmployeeService;

@Controller
@RequestMapping
public class EmployeeControlle {
	EmployeeService employeeService;

	public EmployeeControlle(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	@GetMapping("/list")
	public String showEmpList(Model model) {
		model.addAttribute("emps", employeeService.getAllEmployees());
		return "employee-list";
	}
	@GetMapping("/employees/new")
	public String createemployeeForm(Model model) {
		
		model.addAttribute("employee", new Employee());
		return "create_employee";
	}
	@PostMapping("/employees")
	public String saveEmployee(Model model, @ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployee(employee);

		return "redirect:/employees/list";
	}
	@GetMapping("/delete/{id}")
	public String deleteemployee(@PathVariable int id) {
		 employeeService.deleteEmployee(id);
		return "redirect:/employees/list";
	}
	@GetMapping("/update/{id}")
	public String updateemployee(@PathVariable int id) {
		Employee employee = employeeService.getEmployee(id);
		employeeService.deleteEmployee(id);
		return "employees";
	}


}
