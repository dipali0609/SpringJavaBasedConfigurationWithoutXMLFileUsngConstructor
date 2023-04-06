package com.edu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.edu")

public class BeanConfig {
	@Bean
       public Student student()
       {
		return new Student(101,"dipali");   
       }
	
	}

