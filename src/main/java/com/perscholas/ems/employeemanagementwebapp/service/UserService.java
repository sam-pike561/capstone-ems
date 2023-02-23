package com.perscholas.ems.employeemanagementwebapp.service;

import com.perscholas.ems.employeemanagementwebapp.dto.UserRegistrationDto;
import com.perscholas.ems.employeemanagementwebapp.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;



public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}