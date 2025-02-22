package com.project.helloworldmessage.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

// Marks this class as a Spring Bean
public class EmployeeBean {
    private String name = "Sarowar Gupta";

    @Autowired
    // Injects the DepartmentBean automatically
    private DepartmentBean department;

    public String getEmployeeDetails() {
        return "Employee Name: " + name + ", Department: " + department.getDepartmentName();
    }
}

