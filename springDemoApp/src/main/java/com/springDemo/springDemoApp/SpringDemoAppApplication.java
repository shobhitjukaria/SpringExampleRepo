package com.springDemo.springDemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoAppApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(SpringDemoAppApplication.class, args);
	}

}
