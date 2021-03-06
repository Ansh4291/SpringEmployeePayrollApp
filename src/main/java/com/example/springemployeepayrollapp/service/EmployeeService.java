package com.example.springemployeepayrollapp.service;

import com.example.springemployeepayrollapp.dto.EmployeeDTO;
import com.example.springemployeepayrollapp.model.Employee;
import com.example.springemployeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements iEmployeeService{
    private List<Employee> employeeList = new ArrayList<>();
    @Autowired
    EmployeeRepository employeeRepository;

//           **********UC1***************

//    @Override
//    public String EmployeeMessage(){
//        return "Hello World!";
//    }

//    ************UC2**************

//    @Override
//    public Employee findEmployeeById(Integer id) {
//        return employeeRepository.findById(id).orElse(null);
//    }
//    @Override
//    public Employee saveEmployees(Employee employee){
//        return employeeRepository.save(employee);
//    }
//    @Override
//    public List<Employee> findEmployees() {
//        return employeeRepository.findAll();
//    }
//    @Override
//    public Employee editEmployee(Employee employee, Integer id) {
//        Employee existingGreet = employeeRepository.findById(id).orElse(null);
//        if (existingGreet != null) {
//            existingGreet.setName(employee.getName()); ;
//            return employeeRepository.save(existingGreet);
//        }else return null;
//    }
//    @Override
//    public String deleteEmployee(Integer id) {
//        employeeRepository.deleteById(id);
//        return "Data Deleted";
//    }

//    ***********************UC4****************************

//    @Override
//    public List<Employee> getEmployeeData() {
//        List<Employee> empDataList = new ArrayList<>();
//        empDataList.add(new Employee(1, new EmployeeDTO("Anshul", "male", "Engg.", 35000)));
//        return empDataList;
//    }
//    @Override
//    public Employee getEmployeePayrollDataById(int empId) {
//        Employee  empData= null;
//        empData= new Employee (1, new EmployeeDTO("Anshul", "male", "Eng", 35000));
//        return empData;
//    }
//    @Override
//    public Employee createEmployeePayrollData(EmployeeDTO employeeDTO){
//        Employee empData= null;
//        empData= new Employee(1, employeeDTO);
//        return empData;
//    }
//    @Override
//    public Employee updateEmployeePayrollData(EmployeeDTO employeeDTO) {
//        Employee empData= null;
//        empData = new Employee(1, employeeDTO);
//        return empData;
//    }
//
//    public void deleteEmployeePayrollData(int empID) {
//    }

//      ***************UC5******************

    @Override
    public List<Employee> getEmployeeData() {
        return employeeRepository.findAll();
    }
    @Override
    public Employee  getEmployeePayrollDataById(int empId) {
        return employeeRepository.findById(empId).orElse(null);
    }
    @Override
    public Employee createEmployeePayrollData(EmployeeDTO employeeDTO){
        Employee empData = new Employee(employeeDTO);
        return employeeRepository.save(empData);
    }
    @Override
    public Employee updateEmployeePayrollData(int empId, EmployeeDTO employeeDTO){
        Employee employeeDetails=new Employee(empId,employeeDTO);
        employeeRepository.save(employeeDetails);
        return employeeDetails;
    }
    @Override
    public String deleteEmployeePayrollData(int empID) {
        employeeRepository.deleteById(empID);
        return "Data Deleted";
    }
}
