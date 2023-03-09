package com.perscholas.ems.employeemanagementwebapp.service;

import com.perscholas.ems.employeemanagementwebapp.model.Employee;
import com.perscholas.ems.employeemanagementwebapp.repository.EmployeeRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    // JUnit test for saveEmployee
    @Test
    public void saveEmployeeTest() {


    }
}
