package com.bridgelabz.employepayrollapp.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class EmployeePayrollDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message="Employee name INVALID")
    public String name;
    @Min(value=500,message="Min Wage should be more than 500")
    public long salary;

    public EmployeePayrollDTO(String name, long salary){
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "EmployeePayrollDTO{" +
                "firstName='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
