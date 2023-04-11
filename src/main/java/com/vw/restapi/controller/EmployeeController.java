package com.vw.restapi.controller;


import com.vw.restapi.model.Employee;
import com.vw.restapi.request.FilterRequest;
import com.vw.restapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping("/hello")
    public String hello()
    {
        return "hello";
    }

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getEmployees()
    {
        List<Employee> employees = employeeService.getEmployees();
        System.out.println(employees);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id)
    {
        Employee employee = employeeService.getEmployeeById(id);
        System.out.println(employee);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }


    @GetMapping("/employee/sort/{fieldName}")
    public ResponseEntity<List<Employee>> sortByFieldName(@PathVariable String fieldName)
    {
        List<Employee> employees= employeeService.sortByFieldName(fieldName);
        return new ResponseEntity<>(employees,HttpStatus.OK);
    }

    /* provides filter */

    @PostMapping("/employee/filter")
    public ResponseEntity<?> filterEmployees(@RequestBody FilterRequest filterRequest)
    {
        List<Employee> dataAfterFilter = employeeService.getEmployeeWithFilter(filterRequest);
        return new ResponseEntity<List<Employee>>(dataAfterFilter,HttpStatus.OK);
    }

    @GetMapping("/employee/search/{name}")
   public ResponseEntity<?> searchByName(@PathVariable String name)
    {
        System.out.println("Called original");
        return employeeService.searchByName(name);
    }

    @GetMapping("/employee/search/{names}")
    public ResponseEntity<?> searchByNameAlternate(@PathVariable String names)
    {
        List<Employee> employees =  employeeService.getEmployees();

        List<Employee> employeesByName  = employees.stream().map(e->
        {
            if(e.getName().startsWith(names))
                return e;
            else
                return null;
        })
                .filter(e ->e!=null).toList();

        System.out.println("Called alternate");

        return new ResponseEntity<>(employeesByName,HttpStatus.OK);
    }



}
