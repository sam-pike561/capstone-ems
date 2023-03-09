package com.perscholas.ems.employeemanagementwebapp.repository;

import com.perscholas.ems.employeemanagementwebapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// add user repository and expose crud methods for associated class
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
}