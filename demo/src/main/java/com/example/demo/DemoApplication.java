package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Original");
		System.out.println("Logging1");
		System.out.println("Logging2");
		System.out.println("Logging3");
		System.out.println("Logging4 FROM MAIN");
		System.out.println("Logging5 FROM MAIN");
		System.out.println("Logging6 FROM MAIN");
		System.out.println("Logging7 FROM MAIN");
	}

}
