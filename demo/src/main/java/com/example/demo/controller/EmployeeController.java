package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Employee;
import com.example.demo.Service.EmployeeService;

@RestController

public class EmployeeController{

    @Autowired
    EmployeeService employeeService;

    @PostMapping(path = "/registration", consumes = (MediaType.APPLICATION_JSON_VALUE ))
    public ResponseEntity<Employee> saveEmployee( @RequestBody Employee employee) {

        employeeService.save(employee);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);

    }

    @GetMapping(path = "get-all-employees", produces = (MediaType.APPLICATION_JSON_VALUE))
    public Iterable<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

//@PutMapping (path = "/update-info/(empId)", consumes =  (MediaType.APPLICATION_JSON_VALUE))
 //public  ResponseEntity<Employee> updateEmployee(@PathVariable Long empId, @RequestBody Employee) {


//
//    return new ResponseEntity<>(Employee, HttpStatus.CREATED);
//    }
}
//
