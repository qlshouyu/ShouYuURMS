package com.qlshouyu.urms.admin.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.qlshouyu.urms"})
public class UrmsAdminApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UrmsAdminApiApplication.class, args);
    }

}
