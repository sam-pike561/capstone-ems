package com.perscholas.ems.employeemanagementwebapp.repository;

import com.perscholas.ems.employeemanagementwebapp.model.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// add meeting repository and expose crud methods for associated classes
@Repository
public interface MeetingRepository extends JpaRepository<Meeting, Long> {
}
