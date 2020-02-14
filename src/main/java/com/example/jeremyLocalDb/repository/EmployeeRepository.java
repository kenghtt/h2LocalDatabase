package com.example.jeremyLocalDb.repository;

import com.example.jeremyLocalDb.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    @Override
    Iterable<Employee> findAll();
}
