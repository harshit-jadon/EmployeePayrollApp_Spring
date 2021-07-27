package com.bridgelabz.employepayrollapp.controller;

import com.bridgelabz.employepayrollapp.dto.EmployeePayrollDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @GetMapping(value={"","/","get"})
    public ResponseEntity<String> getEmployeePayroll(){
        return new ResponseEntity<String>("Get Employee Payroll... ", HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<String> getEmployeePayrollById(@PathVariable int id){
        return new ResponseEntity<String>("Get Employee Payroll for id " + id,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createEmployeePayroll(@RequestBody EmployeePayrollDTO employeePayrollDto){
        return new ResponseEntity<String>("Create Employee Payroll Data: "+ employeePayrollDto,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateEmployeePayroll(@RequestBody EmployeePayrollDTO employeePayrollDto){
        return new ResponseEntity<String>("Update Employee Payroll Data: "+ employeePayrollDto,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployeePayroll(@PathVariable("id") int id){
        return new ResponseEntity<String>("Delete Employee Payroll Data by Id: "+id, HttpStatus.OK);
    }

}
