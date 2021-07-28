package com.bridgelabz.employepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j

public class EmployePayrollAppApplication {

    public static void main(String[] args) {
        ApplicationContext context =SpringApplication.run(EmployePayrollAppApplication.class, args);
        log.info("**************...Welcome to Employee Payroll App...**************");
        log.info("...Employee Payroll App Started...",context.getEnvironment().getProperty("environment"));
    }

}
