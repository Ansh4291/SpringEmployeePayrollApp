package com.example.springemployeepayrollapp.controller;

import com.example.springemployeepayrollapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService service;
    @RequestMapping("/welcome")
    public String displayMessage(){
        return service.EmployeeMessage();
    }

}
