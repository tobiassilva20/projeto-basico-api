package com.employee.employee.api.repository;

import com.employee.employee.api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    ArrayList<Employee> findAll();
}
