package com.example.springemployeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class SpringEmployeePayrollAppApplication {

    public static void main(String[] args) {
     SpringApplication.run(SpringEmployeePayrollAppApplication.class, args);
        log.info("Hello & Welcome to the employee payroll App");
    }

}
