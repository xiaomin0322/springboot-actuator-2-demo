package com.example.actuator2.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * http://localhost:8080/actuator/metrics
 * 
 * http://localhost:8080/actuator/
 * @author Zengmin.Zhang
 *
 */
@SpringBootApplication
public class SpringbootAutuator2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAutuator2DemoApplication.class, args);
	}
}
