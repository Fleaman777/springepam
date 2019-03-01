package com.epam.learnspring.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private Long id;

    private String name;
    private String surname;

    @OneToOne(fetch = FetchType.EAGER, mappedBy="employee")
    @JsonManagedReference
    private Employer employer;
}
