package com.example.demo.bo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class DeptEmployee implements Employee {
	
	@Override
	public void getType() {
		System.out.println("In dept Employee");
	}
}
