package com.qlshouyu.urms.service;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.TestPropertySource;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 高露 微信：18956074544
 * @Description TODO
 * @date 19-5-28上午11:47
 */
@MapperScan("com.qlshouyu.urms.repository")
@SpringBootApplication(scanBasePackages = {"com.qlshouyu.urms"})
@TestPropertySource("classpath:application.properties")
public class TestRunner {
}
