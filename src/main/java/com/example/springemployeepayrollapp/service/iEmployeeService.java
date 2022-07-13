package com.example.springemployeepayrollapp.service;

import com.example.springemployeepayrollapp.model.Employee;

import java.util.List;

public interface iEmployeeService {
//        **********UC1***************
    String EmployeeMessage();

    //    ************UC2**************
    Employee findEmployeeById(Integer id);

    Employee saveEmployees(Employee employee);

    List<Employee> findEmployees();

    Employee editEmployee(Employee employee, Integer id);

    String deleteEmployee(Integer id);
}
