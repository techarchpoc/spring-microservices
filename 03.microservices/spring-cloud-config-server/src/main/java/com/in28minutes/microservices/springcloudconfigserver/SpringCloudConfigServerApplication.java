package com.in28minutes.microservices.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServerApplication {

	public static void main(String[] args) {
		
		for(int i =0; i <=10; i++) {
            		System.out.println("*");
        }
		System.out.println("Spring cloud config server running...");
		
		for(int i =0; i <=10; i++) {
            		System.out.println("*");
        }
		
		
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);              

	}
}
