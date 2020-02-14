package com.example.jeremyLocalDb.controller;

import com.example.jeremyLocalDb.entities.Employee;
import com.example.jeremyLocalDb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee response){

        employeeRepository.save(response);

        return "Successfully Saved into DB";

    }

    @GetMapping("/findEmployee")
    public Iterable<Employee> addEmployee(){


        return employeeRepository.findAll();

    }


    @GetMapping("/hello")
    public String hello(){

        return "You Rock";
    }




}
