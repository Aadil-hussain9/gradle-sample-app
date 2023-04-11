package com.vw.restapi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="employee")
@Builder
public class Employee {

    @Id
    @GeneratedValue
    private Integer userId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String projectName;

    @Column(nullable = false)
    private String reportingManager;

    @Column(nullable = false)
    private Integer totalITExperience;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private Integer empID;

    @Column(nullable = false)
    private String emailId;

    @Column(nullable = false)
    private String emp_status;

    @Column(nullable = false)
    private Integer grade;

    @Column(nullable = false)
    private Integer vwit_exp;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false)
    private String department;

    public Employee(Integer userId, String name, String projectName, String reportingManager, Integer totalITExperience, String location, Integer empID, String emailId, String emp_status, Integer grade, Integer vwit_exp, String type, String role, String department) {
        this.userId = userId;
        this.name = name;
        this.projectName = projectName;
        this.reportingManager = reportingManager;
        this.totalITExperience = totalITExperience;
        this.location = location;
        this.empID = empID;
        this.emailId = emailId;
        this.emp_status = emp_status;
        this.grade = grade;
        this.vwit_exp = vwit_exp;
        this.type = type;
        this.role = role;
        this.department = department;
    }

    public Employee() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getReportingManager() {
        return reportingManager;
    }

    public void setReportingManager(String reportingManager) {
        this.reportingManager = reportingManager;
    }

    public Integer getTotalITExperience() {
        return totalITExperience;
    }

    public void setTotalITExperience(Integer totalITExperience) {
        this.totalITExperience = totalITExperience;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getEmpID() {
        return empID;
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmp_status() {
        return emp_status;
    }

    public void setEmp_status(String emp_status) {
        this.emp_status = emp_status;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getVwit_exp() {
        return vwit_exp;
    }

    public void setVwit_exp(Integer vwit_exp) {
        this.vwit_exp = vwit_exp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }




}
