package com.example.demo.bo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "rajeshRegularEmployee")
public class RegularEmployee implements Employee {

	String name;
	int age;

	// Bean Object Type
	// Bean By name

	@Override
	public String toString() {
		return "RegularEmployee [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void getType() {
		System.out.println("In regualar Employee");
	}
}
