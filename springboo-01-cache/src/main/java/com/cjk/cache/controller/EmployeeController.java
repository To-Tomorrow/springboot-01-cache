package com.cjk.cache.controller;

import com.cjk.cache.entity.Employee;
import com.cjk.cache.mapper.EmployeeMapper;
import com.cjk.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/emp/{id}")
    public Employee getEmployee(@PathVariable Integer id){
        return employeeService.getEmp(id);
    }
}
