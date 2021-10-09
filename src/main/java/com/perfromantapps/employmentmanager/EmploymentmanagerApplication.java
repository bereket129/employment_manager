package com.perfromantapps.employmentmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.perfromantapps.employmentmanager.repositories")
@EntityScan(basePackages = "com.perfromantapps.employmentmanager.model")
public class EmploymentmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmploymentmanagerApplication.class, args);
	}


}
