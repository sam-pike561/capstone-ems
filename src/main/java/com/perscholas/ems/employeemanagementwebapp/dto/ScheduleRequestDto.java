package com.perscholas.ems.employeemanagementwebapp.dto;

import com.perscholas.ems.employeemanagementwebapp.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleRequestDto {
    private Employee employee;
}
