package com.perscholas.ems.employeemanagementwebapp.service;

import java.util.List;

import com.perscholas.ems.employeemanagementwebapp.model.Employee;
import org.springframework.data.domain.Page;
// Abstract employee service methods from implementation

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
