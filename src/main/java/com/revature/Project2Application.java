package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.revature.cotroller.Haocheng;
import com.revature.service.IForumService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.revature.service", "com.revature.service.impl", "com.revature.dao", "com.revature.controller"})
@ComponentScan(basePackageClasses = {Haocheng.class, IForumService.class})
@EnableSwagger2
public class Project2Application {

    public static void main(String[] args) {
        SpringApplication.run(Project2Application.class, args);
    }

}
