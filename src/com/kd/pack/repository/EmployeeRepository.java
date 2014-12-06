package com.kd.pack.repository;

import com.kd.pack.model.Address;
import com.kd.pack.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateOperations;
import org.springframework.stereotype.Repository;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by dima on 7.12.14.
 */
@Repository
public class EmployeeRepository {
    @Autowired HibernateOperations hibernate;

    public List<Employee> getAllEmployees() {
        return hibernate.loadAll(Employee.class);
    }

    public Employee saveEmployee(Employee employee) {
        hibernate.saveOrUpdate(employee);
        return employee;
    }
}
