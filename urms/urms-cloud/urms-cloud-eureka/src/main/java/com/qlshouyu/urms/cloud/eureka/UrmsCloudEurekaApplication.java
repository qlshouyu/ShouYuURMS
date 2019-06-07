package com.qlshouyu.urms.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UrmsCloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(UrmsCloudEurekaApplication.class, args);
	}

}
