package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.example.demo.bo.Animal;

@Configuration
public class AnimalBeanConfiguration {

	@Bean
	@Scope("prototype")
	
	public Animal getCat() {
		Animal a = new Animal("cat");
		a.setName("cat");
		a.setLegCount("4");
		return a;
	}
	
	@Bean
	@Scope("prototype")
	@Primary
	public Animal getKangaroo() {
		Animal a = new Animal("kangarro");
		a.setName("kangaroo");
		a.setLegCount("2");
		return a;
	}
	
	
	

}
