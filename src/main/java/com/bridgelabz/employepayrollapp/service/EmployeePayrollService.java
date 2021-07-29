package com.bridgelabz.employepayrollapp.service;


import com.bridgelabz.employepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employepayrollapp.exceptions.EmployeePayrollException;
import com.bridgelabz.employepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{

    List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();

    @Override
    public List<EmployeePayrollData> getEmployeePayroll() {
        return employeePayrollDataList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollById(int id) {
      return employeePayrollDataList.stream()
              .filter(employeePayrollData -> employeePayrollData.getId() == id)
              .findFirst()
              .orElseThrow(() -> new EmployeePayrollException("Employee Not Found"));
    }

    @Override
    public EmployeePayrollData createEmployeePayroll(EmployeePayrollDTO employeePayrollDto) {
        EmployeePayrollData employeePayrollData= null;
        employeePayrollData = new EmployeePayrollData(employeePayrollDataList.size()+1, employeePayrollDto);
        employeePayrollDataList.add(employeePayrollData);
        return employeePayrollData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayroll(int id,EmployeePayrollDTO employeePayrollDto) {
        EmployeePayrollData employeePayrollData= this.getEmployeePayrollById(id);
        employeePayrollData.setName(employeePayrollDto.name);
        employeePayrollData.setSalary(employeePayrollDto.salary);
        employeePayrollDataList.set(id-1,employeePayrollData);
        return employeePayrollData;
    }

    @Override
    public void deleteEmployeePayroll(int id) {
    employeePayrollDataList.remove(id-1);
    }
}
