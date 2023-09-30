package com.example.jenkinsTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {

	public static void main(String[] args) {

		System.err.println("hello jenkins!!!");
		SpringApplication.run(JenkinsTestApplication.class, args);
	}

}
