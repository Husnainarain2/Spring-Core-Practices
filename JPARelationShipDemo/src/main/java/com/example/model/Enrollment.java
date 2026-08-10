package com.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String semster;
    private String grade;

    @ManyToOne
    @JoinColumn(name = "student-id")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "course-id")
    private Course course;
}
