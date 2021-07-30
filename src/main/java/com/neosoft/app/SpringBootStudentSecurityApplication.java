package com.neosoft.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringBootStudentSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudentSecurityApplication.class, args);
	}

}
