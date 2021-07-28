package com.bridgelabz.employepayrollapp.service;


import com.bridgelabz.employepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{

    @Override
    public List<EmployeePayrollData> getEmployeePayroll() {
        List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();
        employeePayrollDataList.add(new EmployeePayrollData(1, new EmployeePayrollDTO("Ankur",456987)));
        return employeePayrollDataList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollById(int id) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, new EmployeePayrollDTO("Ankur",456987));
        return employeePayrollData;
    }

    @Override
    public EmployeePayrollData createEmployeePayroll(EmployeePayrollDTO employeePayrollDto) {
        EmployeePayrollData employeePayrollData= null;
        employeePayrollData = new EmployeePayrollData(1, employeePayrollDto);
        return employeePayrollData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayroll(EmployeePayrollDTO employeePayrollDto) {
        EmployeePayrollData employeePayrollData= null;
        employeePayrollData = new EmployeePayrollData(1, employeePayrollDto);
        return employeePayrollData;
    }

    @Override
    public void deleteEmployeePayroll(int id) {

    }
}
