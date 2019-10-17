package com.qlshouyu.urms.admin.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = {"com.qlshouyu.urms"})
@MapperScan("com.qlshouyu.urms.repository.mapper")
public class UrmsAdminManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UrmsAdminManagerApplication.class, args);
    }

}
