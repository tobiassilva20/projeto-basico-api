package com.employee.employee.api.controller;

import com.employee.employee.api.model.Employee;
import com.employee.employee.api.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;
    @GetMapping("/")
    public String runRoot(){
        return "Wellcome to my Rest API\n";
    }

    @GetMapping("/findall")
    public ArrayList<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/find/{id}")
    public Employee findById(@PathVariable Long id){
        return employeeService.findAllEmployeeById(id);
    }

    @PostMapping("/saveall")
    public void saveAll(){
        employeeService.saveAll();
    }

    @DeleteMapping("/deleteall")
    public void deleteAll(){
        employeeService.deleteAll();
    }

}
