package com.example.demo.bo;

public class Animal {
	
	
	public Animal() {
		this("Generic");
	}
	
	public Animal(String nam) {
		System.out.println("a new animal created: " + nam);
	}

	String name;
	String legCount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLegCount() {
		return legCount;
	}

	public void setLegCount(String legCount) {
		this.legCount = legCount;
	}

}
