package com.cg.emp.Dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Repository;

import com.cg.emp.exceptions.EmployeeException;
import com.cg.emp.pojo.Employee;

@Repository
public class EmployeeRepository {


    private static final Map<String, Employee> empMap = new HashMap<String, Employee>();
 
    static {
        Emps();
    }
 
    private static void Emps() {
        Employee emp1 = new Employee("E01", "Smith", "FS","PUNE");
        Employee emp2 = new Employee("E02", "Allen", "EU","BANGLORE");
        Employee emp3 = new Employee("E03", "Jones", "HR","HYD");
 
        empMap.put(emp1.getEmpId(), emp1);
        empMap.put(emp2.getEmpId(), emp2);
        empMap.put(emp3.getEmpId(), emp3);
    }
 
    public Employee getEmployee(String empId) {
       
        return empMap.get(empId);
    }
 
    public Employee addEmployee(Employee emp) throws EmployeeException{
    	String empId=emp.getEmpId();
    	String regex="^[0-9]{6}$";
    	Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(empId);
    	if((matcher.matches()))
		{
    		 empMap.put(emp.getEmpId(),emp);
		}
		else
		{
			throw new EmployeeException("empId is invalid");
		}
       
        return emp;
    }
 
    public Employee updateEmployee(Employee emp) {
        empMap.put(emp.getEmpId(), emp);
        return emp;
    }
 
    public void deleteEmployee(String empId) {
        empMap.remove(empId);
        
    }
 
    public List<Employee> getAllEmployees() {
        Collection<Employee> empc = empMap.values();
        List<Employee> list = new ArrayList<Employee>();
        list.addAll(empc);
        return list;
    }

	
 
}

