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

    /**
     * Handles the root request
     * @return
     */
    @GetMapping("/")
    public String runRoot(){
        return "Wellcome to my Rest API\n";
    }

    /**
     * Find all employees
     * @return
     */
    @GetMapping("/findall")
    public ArrayList<Employee> findAll(){
        return employeeService.findAll();
    }

    /**
     * Find an Employee by an id.
     * @param id
     * @return
     */
    @GetMapping("/find/{id}")
    public Employee findById(@PathVariable Long id){
        return employeeService.findAllEmployeeById(id);
    }

    /**
     * Save all employees in database
     */
    @PostMapping("/saveall")
    public void saveAll(){
        employeeService.saveAll();
    }

    /**
     * Delete all data from database
     */
    @DeleteMapping("/deleteall")
    public void deleteAll(){
        employeeService.deleteAll();
    }

}
