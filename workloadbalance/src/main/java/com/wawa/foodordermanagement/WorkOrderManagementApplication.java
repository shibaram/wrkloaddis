package com.wawa.foodordermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.wawa.foodordermanagement")
public class WorkOrderManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkOrderManagementApplication.class, args);
	}

}
