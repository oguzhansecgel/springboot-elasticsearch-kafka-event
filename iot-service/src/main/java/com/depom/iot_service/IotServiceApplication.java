package com.depom.iot_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class IotServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IotServiceApplication.class, args);
	}

}
