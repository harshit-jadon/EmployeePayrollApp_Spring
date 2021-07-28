package com.bridgelabz.employepayrollapp.controller;

import com.bridgelabz.employepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employepayrollapp.service.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService employeePayrollService;

    @GetMapping(value={"","/","get"})
    public ResponseEntity<ResponseDTO> getEmployeePayroll(){
        List<EmployeePayrollData> employeePayrollDataList = null;
        employeePayrollDataList = employeePayrollService.getEmployeePayroll();
        ResponseDTO responseDTO = new ResponseDTO("Get Employee Payroll... ",employeePayrollDataList);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollById(@PathVariable int id){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = employeePayrollService.getEmployeePayrollById(id);
        ResponseDTO responseDTO = new ResponseDTO("Get Employee Payroll for id " ,employeePayrollData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);

    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createEmployeePayroll(@RequestBody EmployeePayrollDTO employeePayrollDto){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = employeePayrollService.createEmployeePayroll(employeePayrollDto);
        ResponseDTO responseDTO = new ResponseDTO("Create Employee Payroll Data: " ,employeePayrollData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateEmployeePayroll(@RequestBody EmployeePayrollDTO employeePayrollDto){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = employeePayrollService.updateEmployeePayroll(employeePayrollDto);
        ResponseDTO responseDTO = new ResponseDTO("Update Employee Payroll Data: ",employeePayrollData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayroll(@PathVariable("id") int id){
        employeePayrollService.deleteEmployeePayroll(id);
        ResponseDTO responseDTO = new ResponseDTO("Delete Employee Payroll Data by Id: ",id);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);

    }

}
