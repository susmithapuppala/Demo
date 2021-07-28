package com.cg.emp.pojo;

public class Employee {
    
	private String empId;
	private String empName;
	private String department;
	private String address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String empId, String empName, String department, String address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.address = address;
	}

	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + ", address="
				+ address + "]";
	}

	
	
	
	
}
