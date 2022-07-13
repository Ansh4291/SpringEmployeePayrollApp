package com.example.springemployeepayrollapp.model;

import com.example.springemployeepayrollapp.dto.EmployeeDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

    public String name;
    String department;
    String gender;
    long salary;
    int id;

    public Employee() {
    }

    public String getName() {
        return name;
    }
    public Employee(int empId, EmployeeDTO employeeDTO) {
        this.id = empId;
        this.name = employeeDTO.name;
        this.department = employeeDTO.department;
        this.gender = employeeDTO.gender;
        this.salary = employeeDTO.salary;
    }
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        salary = salary;
    }

    public Employee(String name, String department, String gender, long salary) {
        this.name = name;
        this.department = department;
        this.gender = gender;
        salary = salary;
    }


}
