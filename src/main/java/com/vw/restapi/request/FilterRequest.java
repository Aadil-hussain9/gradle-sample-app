package com.vw.restapi.request;


import java.util.Date;


public class FilterRequest {
    private String name;

    private String projectName;

    private String reportingManager;

    private Integer totalITExperience;

    private String location;

    private Integer empID;

    private String emailId;

    private String emp_status;

    private Integer grade;

    private Integer vwit_exp;
    private  Date doj;

    private String type;

    private String role;

    private String department;

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

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
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
