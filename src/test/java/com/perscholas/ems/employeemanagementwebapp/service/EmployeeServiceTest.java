package com.perscholas.ems.employeemanagementwebapp.service;

import com.perscholas.ems.employeemanagementwebapp.model.Employee;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class EmployeeServiceTest {
    @Autowired
    EmployeeService employeeService;


    @BeforeAll
    void setUp() {
        Employee employee = new Employee();
        employee.setFirstName("steve");
        employee.setLastName("smith");
        employee.setEmail("example@gmail.com");
        employee.setAddress("Sri Lanka");
        employee.setJobTitle("Developer");
        employeeService.saveEmployee(employee);
    }

    @Test
    void testFindAll() {
        Assertions.assertFalse(employeeService.getAllEmployees().isEmpty());
    }

    @Test
    void testFindById() {
        Employee employee = employeeService.getEmployeeById(1);
        Assertions.assertEquals("steve", employee.getFirstName());
    }


    @Test
     void updateEmployee() {
        Employee employeeFromDb = employeeService.getEmployeeById(1);
        // crush the variables of the object found
        employeeFromDb.setFirstName("john");
        employeeFromDb.setLastName("dew");
        employeeFromDb.setEmail("jd@test.com");
        employeeService.saveEmployee(employeeFromDb);

        Assertions.assertEquals("john", employeeFromDb.getFirstName());

    }

    @AfterAll
    void tearDown() {
        employeeService.deleteEmployeeById(1);
    }
}