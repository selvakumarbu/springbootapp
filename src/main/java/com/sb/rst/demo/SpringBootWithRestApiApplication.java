package com.sb.rst.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.sb.rst.demo"})
public class SpringBootWithRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithRestApiApplication.class, args);
	}
}
