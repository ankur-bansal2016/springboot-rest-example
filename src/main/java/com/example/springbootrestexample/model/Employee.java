package com.example.springbootrestexample.model;

public class Employee {

	private int empId;
	
	private String empName;
	
	private String empDepartment;
	
	public Employee(){
		super();
	}

	public Employee(int empId, String empName, String empDepartment) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	
	
	
	
	
}
