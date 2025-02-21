package com.web.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.demo.entites.Employee;
import com.web.demo.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository emprepo;
	
	public Employee  onboard(Employee emp) {
		return emprepo.save(emp);
	}
	public Employee getEmployee(int id) {
		Employee e = emprepo.findById(id).get();
		return e;
	}
	
	public List<Employee> getAllEmployee() {
		return emprepo.findAll();
	}
	
	public Employee updateEmployee(Employee emp) {
		return emprepo.save(emp);
	}
	
	public String deleteEmployee(int id) {
		emprepo.deleteById(id);
		return "Employee with "+id+" deleted successfully";
	}
	
	
}
