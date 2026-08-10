package com.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @ManyToOne
    @JoinColumn(name = "dept-id")
    private Department department;

    @OneToMany
    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments;

    public Student(Long id, String name, String email, Department department, List<Enrollment> enrollments) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.enrollments = enrollments;
    }
}
