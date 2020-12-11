package com.example.home_work_service_two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HomeWorkServiceTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeWorkServiceTwoApplication.class, args);
	}

}
