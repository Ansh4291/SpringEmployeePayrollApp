package com.example.springemployeepayrollapp.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements iEmployeeService{
    @Override
    public String EmployeeMessage(){
        return "Hello World!";
    }
}
