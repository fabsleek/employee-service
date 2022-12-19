package com.example.demo.Service;

import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    public Iterable<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

//    public void update(Long empId, Employee employee) {
//
//        Employee oldEmployeeDetails = employeeRepository.findById(empId).get();
//
//        oldEmployeeDetails.setFirstname(employee.getFirstname());
//        oldEmployeeDetails.setLastname(employee.getLastname());
//        oldEmployeeDetails.setDepartment(employee.getDepartment());
//        oldEmployeeDetails.setDepartmentId(employee.getDepartmentId());
//        oldEmployeeDetails.setEmail(employee.getEmail());
//        oldEmployeeDetails.setRole(employee.getRole());
//        oldEmployeeDetails.setSalary(employee.getSalary());
//
//        employeeRepository.save(oldEmployeeDetails);
//
//    }
}
