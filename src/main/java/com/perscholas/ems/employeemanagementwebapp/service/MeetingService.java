package com.perscholas.ems.employeemanagementwebapp.service;

import com.perscholas.ems.employeemanagementwebapp.model.Employee;
import com.perscholas.ems.employeemanagementwebapp.model.Meeting;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

// Abstract meeting service methods from implementation

@Service
public interface MeetingService {
    List<Meeting> getAllMeetings();
    void saveMeeting(Meeting meeting);
    Meeting getMeetingById(long id);
    void deleteMeetingById(long id);

    Page<Meeting> findPaginatedMeetings(int pageNo, int pageSize, String sortField, String sortDirection);

}
