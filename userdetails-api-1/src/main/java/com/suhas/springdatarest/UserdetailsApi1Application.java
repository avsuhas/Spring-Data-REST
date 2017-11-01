package com.suhas.springdatarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.convert.Jsr310Converters;

@SpringBootApplication
@EntityScan(basePackageClasses= {UserdetailsApi1Application.class, Jsr310Converters.class})
public class UserdetailsApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(UserdetailsApi1Application.class, args);
	}
}
