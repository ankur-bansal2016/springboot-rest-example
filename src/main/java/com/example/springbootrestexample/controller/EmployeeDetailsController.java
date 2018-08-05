package com.example.springbootrestexample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootrestexample.model.Employee;
import com.example.springbootrestexample.service.impl.EmployeeServiceImpl;

@RestController
@RequestMapping("/spring-rest-webapp")
public class EmployeeDetailsController {
	
	@Autowired
	EmployeeServiceImpl employeeService;
	
	@GetMapping(path="/employee/{id}")
	public Employee findEmployeeDetails(@PathVariable int id){
		return employeeService.findEmployeeDetails(id);
	
	}
	
	@GetMapping(path="/employee/findall")
	public ResponseEntity findAllEmployeeDetails(){
		
		List<Employee> empList=new ArrayList<Employee>();
		
		empList=employeeService.findAllEmployeeDetails();
		
		return ResponseEntity.ok().body(empList);
		
	}
	
	@PostMapping(path="/employee")
	public ResponseEntity<?> saveEmployeeDetails(@RequestBody Employee employee){
		
		List<Employee> empList=employeeService.saveEmployeeDetails(employee);
		
		return ResponseEntity.ok().body(empList);
		
	}
	
	@GetMapping(path="/employee/remove/{id}")
	public ResponseEntity<?> removeEmployee(@PathVariable String id){
		
		List<Employee> empList=employeeService.deleteEmployee(Integer.valueOf(id));
		
		return ResponseEntity.ok().body(empList);
		
	}

}
