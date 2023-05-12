package com.vw.restapi.ServiceImpl;

import com.vw.restapi.model.Employee;
import com.vw.restapi.repository.EmployeeRepository;
import com.vw.restapi.repository.UserSpecifications;
import com.vw.restapi.request.FilterRequest;
import com.vw.restapi.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
     EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getEmployees() {
        System.out.println("In get employees serviceImpl");
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> sortByFieldName(String fieldName) {
        return employeeRepository.findAll(Sort.by(Sort.Direction.ASC,fieldName));
    }

    @Override
    public List<Employee> getEmployeeWithFilter(FilterRequest filterRequest) {

        Employee employee
                = new Employee();
        BeanUtils.copyProperties(filterRequest,employee);
        Example<Employee> example = Example.of(employee);
        System.out.println(example.getProbeType());
        List<Employee> employeeList = employeeRepository.findAll(example);

        return employeeList;
    }

    @Override
    public ResponseEntity<?> searchByName(String name) {
        List<Employee> employees = employeeRepository.findByName(name);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @Override
    public List<Employee> searchEmployees(String query) {
        List<Employee> employees = employeeRepository.findByQuery(query);
        return employees;
    }

    @Override
    public List<Employee> searchUsersMethod2(String name, String emailId, Long userId) {
        List<Employee> users = employeeRepository.findAll(UserSpecifications.search(name, emailId, userId));
        return users;
    }
}
