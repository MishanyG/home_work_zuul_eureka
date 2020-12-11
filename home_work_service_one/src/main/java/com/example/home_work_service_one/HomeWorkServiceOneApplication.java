package com.example.home_work_service_one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HomeWorkServiceOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeWorkServiceOneApplication.class, args);
	}

}
