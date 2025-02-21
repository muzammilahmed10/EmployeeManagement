package com.web.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.web.demo.entites.Employee;
import com.web.demo.services.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeService empserv;
	
	@PostMapping("/api/onboard")
    public Employee  onboard(@RequestBody Employee emp) {
		return empserv.onboard(emp);
	}
	
	@GetMapping("/api/getEmployee/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		return empserv.getEmployee(id);
	}
	
	@GetMapping("/api/getAllEmployee")
	public List<Employee> getAllEmployee() {
		return empserv.getAllEmployee();
	}
	
	@PutMapping("/api/update")
    public Employee updateEmployee(@RequestBody Employee emp) {
		return empserv.updateEmployee(emp);
	}
	
	@DeleteMapping("/api/delete/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		return empserv.deleteEmployee(id);
	}
}
