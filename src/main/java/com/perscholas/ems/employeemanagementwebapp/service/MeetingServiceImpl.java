package com.perscholas.ems.employeemanagementwebapp.service;

import com.perscholas.ems.employeemanagementwebapp.model.Employee;
import com.perscholas.ems.employeemanagementwebapp.model.Meeting;
import com.perscholas.ems.employeemanagementwebapp.repository.MeetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MeetingServiceImpl implements MeetingService {

    @Autowired
    private MeetingRepository meetingRepository;


    @Override
    public List<Meeting> getAllMeetings() {
       return meetingRepository.findAll();
    }

    @Override
    public void saveMeeting(Meeting meeting) {
        this.meetingRepository.save(meeting);
    }

    @Override
    public Meeting getMeetingById(long id) {
        Optional<Meeting> optional = meetingRepository.findById(id);
        Meeting meeting = null;
        if (optional.isPresent()) {
            meeting = optional.get();
        } else {
            throw new RuntimeException(" Meeting not found for id :: " + id);
        }
        return meeting;
    }

    @Override
    public void deleteMeetingById(long id) {
        this.meetingRepository.deleteById(id);
    }

    @Override
    public Page<Meeting> findPaginatedMeetings(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
                Sort.by(sortField).descending();

        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        return this.meetingRepository.findAll(pageable);
    }
}