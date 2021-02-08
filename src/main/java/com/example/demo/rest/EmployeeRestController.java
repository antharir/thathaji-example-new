package com.example.demo.rest;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bo.Animal;
import com.example.demo.bo.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate template;
	
	@Autowired
	@Qualifier(value = "deptEmployee")
	Employee emp;
	
	@Autowired
	//@Qualifier("getKangaroo")
	Animal x;
	
	
	
	@GetMapping
	public Map<String, String> getEmployee() {
		
		Integer tableCouInteger = template.queryForObject("select count(*) from dtreecore", Integer.class);
		
		
		System.out.println("Emp Obj --> "  + emp);
		return Map.of("name", "" + dataSource, "tableCouInteger", tableCouInteger+"");
	}
	
}
