package com.perscholas.ems.employeemanagementwebapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

//Define employee entity with fields, getters/setters and constructors.

@Data
@Builder
@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "salary")
    private String salary;

    @OneToMany(targetEntity = Meeting.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "em_fk", referencedColumnName = "id")
    private List<Meeting> meetings;

}