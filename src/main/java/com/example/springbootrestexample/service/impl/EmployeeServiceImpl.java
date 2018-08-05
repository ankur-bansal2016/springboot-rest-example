package com.example.springbootrestexample.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.example.springbootrestexample.model.Employee;
@Service
public class EmployeeServiceImpl {

	List<Employee> empList=null;

	public List<Employee> findAllEmployeeDetails() {

		Employee e1 = new Employee(1, "James", "IT");
		Employee e2 = new Employee(2, "Charles", "HR");
		empList=new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);

		return empList;
	}
	
	public Employee findEmployeeDetails(int empId ) {
		
		for (Employee employee : empList) {
			if(empId==employee.getEmpId()){
				return employee;
			}
		}
		return null;
	}

	
	public List<Employee> saveEmployeeDetails(Employee employee) {
		 if(CollectionUtils.isEmpty(empList)){
			 employee.setEmpId(empList.size()+1);
			 empList.add(employee);
		}else if (!empList.contains(employee)) {
			employee.setEmpId(empList.size()+1);
			empList.add(employee);
		}

		return empList;

	}
	
	public List<Employee> deleteEmployee(int id) {
		for (Employee employee : empList) {
			if(id==employee.getEmpId()){
				empList.remove(employee);
				return empList;
			}
		}

		return empList;

	}
}
