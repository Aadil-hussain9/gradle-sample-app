//package com.vw.restapi.service;
//
//import com.vw.restapi.model.Employee;
//import com.vw.restapi.repository.EmployeeRepository;
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Random;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//@Service
//public class FillDatabase {
//
//    @Autowired
//    EmployeeRepository employeeRepository;
//
//    @PostConstruct
//    public void initDB() {
//        Random rand = new Random();
//        List<Employee> products = IntStream.rangeClosed(1, 100)
//                .mapToObj(i -> new Employee(rand.nextInt(1000) + 1,
//                        "Employee" + rand.nextInt(1000) + 1,
//                        "Project" + rand.nextInt(10) + 1,
//                        "Manager" + rand.nextInt(5) + 1,
//                        rand.nextInt(20) + 1,
//                        "Location" + rand.nextInt(5) + 1,
//                        rand.nextInt(100) + 1,
//                        "employee" + rand.nextInt(100) + 1 + "@example.com",
//                        "Active",
//                        rand.nextInt(10) + 1,
//                        rand.nextInt(10) + 1,
//                        "INTERNAL",
//                        "Developer",
//                        "IT"))
//                .collect(Collectors.toList());
//        employeeRepository.saveAll(products);
//    }
//}