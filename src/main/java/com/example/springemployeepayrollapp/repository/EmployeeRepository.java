package com.example.springemployeepayrollapp.repository;

import com.example.springemployeepayrollapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee ,Integer > {
}
