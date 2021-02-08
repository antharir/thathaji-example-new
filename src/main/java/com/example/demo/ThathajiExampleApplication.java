package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.bo.DeptEmployee;
import com.example.demo.bo.Employee;
import com.example.demo.bo.RegularEmployee;

@SpringBootApplication
public class ThathajiExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(ThathajiExampleApplication.class, args);
		
		System.out.println("In Main method");
		//Employee bean = ac.getBean(Employee.class);
		//Employee bean = (Employee) ce.getBean("regularEmployee");
		//Employee bean = (Employee) ce.getBean("regularEmployee");
		//System.out.println("Bean sample Test --> " + bean);
		//bean.getType();
		
	}

}
