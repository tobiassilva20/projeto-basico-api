package com.employee.employee.api.service;

import com.employee.employee.api.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

public interface EmployeeService {
    ArrayList<Employee> findAll();
    Employee findAllEmployeeById(Long id);
    void saveAll();
    void deleteAll();
}
