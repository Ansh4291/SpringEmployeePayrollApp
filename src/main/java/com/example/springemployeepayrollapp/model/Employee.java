package com.example.springemployeepayrollapp.model;

import com.example.springemployeepayrollapp.dto.EmployeeDTO;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;


@Data
@RequiredArgsConstructor
@Entity
public class Employee {
    @Id
    @Column(name = "employee_id")
    @GeneratedValue
    int id;
    @Column(name = "name")
    private String name;
    private Long salary;
    private String gender;
    private String profilePic;
    private String note;
    private LocalDate startDate;
    @CollectionTable(name = "employee_department",joinColumns = @JoinColumn(name = "id"))
    @ElementCollection
    public List<String> department;

    public Employee(EmployeeDTO employeePayrollDTO) {
        this.id=id;
        this.name= employeePayrollDTO.name;
        this.department=employeePayrollDTO.department;
        this.gender=employeePayrollDTO.gender;
        this.salary=employeePayrollDTO.salary;
        this.startDate=employeePayrollDTO.startDate;
        this.profilePic=employeePayrollDTO.profilePic;
        this.note=employeePayrollDTO.note;
    }

}
