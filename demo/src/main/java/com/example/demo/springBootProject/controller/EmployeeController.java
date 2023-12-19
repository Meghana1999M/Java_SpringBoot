package com.example.demo.springBootProject.controller;

import com.example.demo.springBootProject.entity.Employee;
import com.example.demo.springBootProject.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.demo.springBootProject.constants.AppConstants.EMPLOYEE;

@RestController
@RequestMapping("/restService/" + EMPLOYEE)
@RequiredArgsConstructor
@Slf4j
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/createEmployee")
    public ResponseEntity<String> createEmployee(Employee employee){
        return ResponseEntity.ok(employeeService.createEmployee(employee));
    }
}
