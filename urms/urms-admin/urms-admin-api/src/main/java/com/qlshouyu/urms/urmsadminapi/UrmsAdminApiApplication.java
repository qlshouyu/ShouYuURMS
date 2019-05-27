package com.qlshouyu.urms.urmsadminapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.qlshouyu.urms"})
public class UrmsAdminApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UrmsAdminApiApplication.class, args);
    }

}
