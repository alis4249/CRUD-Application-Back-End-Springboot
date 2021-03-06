package chaudhary.sundar.springboot.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chaudhary.sundar.springboot.model.Employee;
import chaudhary.sundar.springboot.repository.EmployeeRepository;

@RestController

@CrossOrigin(origins= "http://localhost:4200")


public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//get all employees
	
	@RequestMapping("employees")
	public List<Employee> getAllEmployees(){ 
		return employeeRepository.findAll();
		
	}
	
	// Lets create add employee rest API  
	
	@PostMapping("employees")
	
     public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
		
	}
		
	}


