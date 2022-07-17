package com.example.springemployeepayrollapp.service;

import com.example.springemployeepayrollapp.dto.EmployeeDTO;
import com.example.springemployeepayrollapp.model.Employee;

import java.util.List;

public interface iEmployeeService {
//        **********UC1***************

//    String EmployeeMessage();

    //    ************UC2**************

//    Employee findEmployeeById(Integer id);
//
//    Employee saveEmployees(Employee employee);
//
//    List<Employee> findEmployees();
//
//    Employee editEmployee(Employee employee, Integer id);
//
//    String deleteEmployee(Integer id);
//
//    ********************UC4********************
List<Employee> getEmployeeData();



    Employee getEmployeePayrollDataById(int empId);

    Employee createEmployeePayrollData(EmployeeDTO employeeDTO);

    Employee updateEmployeePayrollData(int empId, EmployeeDTO employeeDTO);

    String deleteEmployeePayrollData(int empID);
}

