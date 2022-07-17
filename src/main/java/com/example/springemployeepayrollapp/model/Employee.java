package com.example.springemployeepayrollapp.model;

import com.example.springemployeepayrollapp.dto.EmployeeDTO;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@RequiredArgsConstructor
@Entity
public class Employee {
    int id;
    String name;
    String department;
    String gender;
    long salary;
    String startDate;
    String note;
    String profilePic;


    public Employee(int empId, EmployeeDTO employeeDTO) {
        this.id = empId;
        this.name = employeeDTO.name;
        this.department = employeeDTO.department;
        this.gender = employeeDTO.gender;
        this.salary = employeeDTO.salary;
        this.startDate = employeeDTO.startDate;
        this.note = employeeDTO.note;
        this.profilePic = employeeDTO.profilePic;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
