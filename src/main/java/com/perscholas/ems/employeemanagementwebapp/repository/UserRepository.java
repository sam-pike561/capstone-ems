package com.perscholas.ems.employeemanagementwebapp.repository;

import com.perscholas.ems.employeemanagementwebapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
}