package com.perscholas.ems.employeemanagementwebapp.controller;


import com.perscholas.ems.employeemanagementwebapp.model.Employee;
import com.perscholas.ems.employeemanagementwebapp.model.Meeting;
import com.perscholas.ems.employeemanagementwebapp.service.EmployeeService;
import com.perscholas.ems.employeemanagementwebapp.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class ScheduleController {

    @Autowired
    private MeetingService meetingService;


    @GetMapping("/schedule")
    public String showSchedule(Model model) {
        return findPaginatedMeetings(1, "startingHour", "asc", model);
    }


    @GetMapping("/showNewMeetingForm")
    public String showNewMeetingForm(Model model) {
        // create model attribute to bind form data
        Meeting meeting = new Meeting();
        model.addAttribute("meeting", meeting);
        return "new_meeting";
    }

    @PostMapping("/saveMeeting")
    public String saveMeeting(@ModelAttribute("meeting") Meeting meeting) {
        // save employee to database
        meetingService.saveMeeting(meeting);
        return "redirect:/";
    }


    @GetMapping(name = "/meeting_page/{pageNo}")
    public String findPaginatedMeetings(@PathVariable(value = "pageNo") int pageNo,
                                @RequestParam("sortField") String sortField,
                                @RequestParam("sortDir") String sortDir,
                                Model model) {
        int pageSize = 5;

        Page<Meeting> page = meetingService.findPaginatedMeetings(pageNo, pageSize, sortField, sortDir);
        List<Meeting> listMeetings = page.getContent();

        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());

        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDir", sortDir);
        model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");

        model.addAttribute("listMeetings", listMeetings);
        return "schedule";
    }

}
