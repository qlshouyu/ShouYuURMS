package com.qlshouyu.urms.admin.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.PropertySource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@SpringBootApplication(scanBasePackages = {"com.qlshouyu.urms"})
//@EnableEurekaClient
public class UrmsAdminApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UrmsAdminApiApplication.class, args);
    }

}
