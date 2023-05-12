package com.vw.restapi.service;

import com.vw.restapi.model.Employee;
import com.vw.restapi.request.FilterRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();

    Employee getEmployeeById(Integer id);

   List<Employee> sortByFieldName(String fieldName);

    List<Employee> getEmployeeWithFilter(FilterRequest filterRequest);

    ResponseEntity<?> searchByName(String name);

    List<Employee> searchEmployees(String query);

    List<Employee> searchUsersMethod2(String name, String emailId, Long Userid);
}
