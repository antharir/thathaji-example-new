package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.bo.Employee;
import com.example.demo.bo.RegularEmployee;


public class EmpBeanConfiguration {
	
	
	@Bean
	public Employee rajesh() {
		
		RegularEmployee e = new RegularEmployee();
		return e;
		
	}
	
}
