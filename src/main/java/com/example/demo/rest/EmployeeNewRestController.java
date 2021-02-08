package com.example.demo.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bo.Animal;
import com.example.demo.bo.Employee;

@RestController
@RequestMapping("/employeen")
public class EmployeeNewRestController {

	
	@Autowired
	@Qualifier(value = "deptEmployee")
	Employee emp;
	
	
	@Autowired
	//@Qualifier("getCat")
	Animal x;
	
	@GetMapping
	public Map<String, String> getEmployee() {
		
		System.out.println("Emp Obj --> "  + emp);
		
		return Map.of("name", "" + x);
	}
	
}
