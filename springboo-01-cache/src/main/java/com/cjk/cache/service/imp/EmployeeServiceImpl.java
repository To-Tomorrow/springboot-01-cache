package com.cjk.cache.service.imp;

import com.cjk.cache.entity.Employee;
import com.cjk.cache.mapper.EmployeeMapper;
import com.cjk.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
//    @Cacheable(cacheNames = "emp",key = "#root.methodName+'['+#id+']'")
    @Cacheable(cacheNames = "emp",keyGenerator = "myKeyGenerator")
    public Employee getEmp(Integer id) {
        System.out.println("查询"+id+"号员工");
        return employeeMapper.getEmpById(id);
    }
}
