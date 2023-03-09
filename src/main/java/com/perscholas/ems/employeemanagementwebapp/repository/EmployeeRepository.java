package com.perscholas.ems.employeemanagementwebapp.repository;

import com.perscholas.ems.employeemanagementwebapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// add employee repository and expose crud methods for associated class
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}