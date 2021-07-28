package com.cg.emp.controller;

import java.util.ArrayList;
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

import com.cg.emp.Dao.EmployeeRepository;
import com.cg.emp.exceptions.EmployeeException;
import com.cg.emp.pojo.Employee;

@RequestMapping("/emp")
@RestController
public class EmployeeController {
@Autowired
private EmployeeRepository empRepo;
	@PostMapping("/add")
	public  Employee addEmployee(@RequestBody Employee emp){
		empRepo.addEmployee(emp);
		return emp;	
	}
	
	@GetMapping("/all")
	public List<Employee> getAllEmployees() throws EmployeeException{
		List<Employee> employee= new ArrayList<>();
		employee=empRepo.getAllEmployees();
		return employee;	
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable ("id") String empId){
	 empRepo.deleteEmployee(empId);
	}
	
	@PutMapping("/empup")
	public Employee updateEmployee(@RequestBody Employee employee){
		return empRepo.updateEmployee(employee);
	}
}
