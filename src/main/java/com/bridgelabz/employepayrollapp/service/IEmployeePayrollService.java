package com.bridgelabz.employepayrollapp.service;

import com.bridgelabz.employepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employepayrollapp.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {

    List<EmployeePayrollData> getEmployeePayroll();

    EmployeePayrollData getEmployeePayrollById(int id);

    EmployeePayrollData createEmployeePayroll(EmployeePayrollDTO employeePayrollDto);

    EmployeePayrollData updateEmployeePayroll(int id,EmployeePayrollDTO employeePayrollDto);

    void deleteEmployeePayroll(int id);
}
