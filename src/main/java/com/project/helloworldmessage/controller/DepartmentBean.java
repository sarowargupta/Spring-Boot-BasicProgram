package com.project.helloworldmessage.controller;
import org.springframework.stereotype.Component;

@Component
// Marks this class as a Spring Bean
public class DepartmentBean {
    private String departmentName = "IT";

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}


