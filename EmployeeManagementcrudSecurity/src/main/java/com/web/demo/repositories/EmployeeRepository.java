package com.web.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.demo.entites.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
