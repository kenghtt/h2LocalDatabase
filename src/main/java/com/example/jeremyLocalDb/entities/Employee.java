package com.example.jeremyLocalDb.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Employee {

    private @Id @GeneratedValue
    Long id;

    int salary;
    String name;
    String email;


}
