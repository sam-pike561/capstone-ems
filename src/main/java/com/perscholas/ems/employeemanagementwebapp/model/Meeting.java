package com.perscholas.ems.employeemanagementwebapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "meetings")
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "starting_hour")
    private String startingHour;
    @Column(name = "title")
    private String title;
}
