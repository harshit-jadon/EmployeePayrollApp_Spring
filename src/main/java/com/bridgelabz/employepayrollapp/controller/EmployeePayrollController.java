package com.bridgelabz.employepayrollapp.controller;

import com.bridgelabz.employepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employepayrollapp.model.EmployeePayrollData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @GetMapping(value={"","/","get"})
//    public ResponseEntity<String> getEmployeePayroll(){
//        return new ResponseEntity<String>("Get Employee Payroll... ", HttpStatus.OK);
    public ResponseEntity<ResponseDTO> getEmployeePayroll(){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1,new EmployeePayrollDTO("Harshit",123789));
        ResponseDTO responseDTO = new ResponseDTO("Get Employee Payroll... ",employeePayrollData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollById(@PathVariable int id){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1,new EmployeePayrollDTO("Harshit",123789));
        ResponseDTO responseDTO = new ResponseDTO("Get Employee Payroll for id " ,employeePayrollData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);

    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createEmployeePayroll(@RequestBody EmployeePayrollDTO employeePayrollDto){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1,employeePayrollDto);
        ResponseDTO responseDTO = new ResponseDTO("Create Employee Payroll Data: " ,employeePayrollData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateEmployeePayroll(@PathVariable("id") int id,@RequestBody EmployeePayrollDTO employeePayrollDto){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(id,employeePayrollDto);
        ResponseDTO responseDTO = new ResponseDTO("Update Employee Payroll Data: ",employeePayrollData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayroll(@PathVariable("id") int id){
        ResponseDTO responseDTO = new ResponseDTO("Delete Employee Payroll Data by Id: ",id);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);

    }

}
