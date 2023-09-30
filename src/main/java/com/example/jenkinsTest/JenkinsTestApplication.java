package com.example.jenkinsTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class JenkinsTestApplication {




	@RequestMapping(value = "/")
	public String testWeb() {
		return "Hello from jenkins";
	}
	public static void main(String[] args) {


		SpringApplication.run(JenkinsTestApplication.class, args);
	}

}
