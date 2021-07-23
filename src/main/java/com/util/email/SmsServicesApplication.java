package com.util.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.util.email"})
public class SmsServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmsServicesApplication.class, args);
	}

}
