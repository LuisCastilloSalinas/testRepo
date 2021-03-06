package com.mrisk.rule.infrastructure.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.mrisk.rule.infrastructure")
public class RuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RuleApplication.class, args);
	}

}
