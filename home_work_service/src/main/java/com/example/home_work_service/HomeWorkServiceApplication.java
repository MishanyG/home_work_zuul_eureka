package com.example.home_work_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HomeWorkServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeWorkServiceApplication.class, args);
	}

}
