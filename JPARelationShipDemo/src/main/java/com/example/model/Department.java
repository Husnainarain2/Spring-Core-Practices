package com.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "department")
    private List<Student> students=new ArrayList<>();

    @OneToMany(mappedBy = "department")
    private List<Course> courses=new ArrayList<>();

    @OneToMany(mappedBy = "department")
    private List<Teacher> teachers=new ArrayList<>();

    public Department(Long id, String name, List<Student> students, List<Course> courses, List<Teacher> teachers) {
        this.id = id;
        this.name = name;
        this.students = students;
        this.courses = courses;
        this.teachers = teachers;
    }
}
