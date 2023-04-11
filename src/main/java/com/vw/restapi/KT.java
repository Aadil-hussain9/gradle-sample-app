package com.vw.restapi;

import com.vw.restapi.model.Employee;
import com.vw.restapi.request.FilterRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Example;

public class KT {
    public static void main(String[] args) {
//        Employee employee = new  Employee(10, "aadil",
//                "SDC Planner", "Raj", 5,
//                "jammu", 102937, "daradil639", "active",
//                10, 2, "ok", "developer", "SDC");

        Employee employee = new Employee();
        Employee employe1 = new Employee();
        employe1.setDepartment("sdc");

        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setDepartment("SDC");


        Example<Employee> example = Example.of(employe1);

        System.out.println(example.getProbeType());
        System.out.println(example.getProbe());
        System.out.println(example.getMatcher());
        System.out.println(example.getProbe().getDepartment());
        System.out.println(example.getProbe().getEmailId());

    }
}
