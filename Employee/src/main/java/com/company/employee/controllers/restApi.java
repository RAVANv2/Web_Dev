package com.company.employee.controllers;


import com.company.employee.models.Employee;
import com.company.employee.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class restApi {

    @Autowired
    EmployeeRepository repository;

    @GetMapping("/")
    public List<Employee> getEmployee(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public String getEmployee(@PathVariable("id") String id){
        System.out.println(id);
        return repository.findById(id).toString();
    }

    @PostMapping ("/{id}")
    public Employee addNewEmployee(@PathVariable("id") String id,@RequestBody Employee emp){
        System.out.println(id);
        repository.save(emp);
        return emp;
    }

    @PutMapping("/{id}")
    public void updateEmployee(@PathVariable("id") String id, @RequestBody Employee emp){
        System.out.println(id);
        emp.setId(id);
        repository.save(emp);
    }
}
