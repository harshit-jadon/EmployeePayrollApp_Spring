package com.bridgelabz.employepayrollapp.model;

import com.bridgelabz.employepayrollapp.dto.EmployeePayrollDTO;

public class EmployeePayrollData {
    private int id;
    private String name;
    private long salary;

    public EmployeePayrollData() {}

    public EmployeePayrollData(int employeeId, EmployeePayrollDTO employeePayrollDto){
        this.id = employeeId;
        this.name = employeePayrollDto.name;
        this.salary = employeePayrollDto.salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
