package com.example.model;

import jakarta.persistence.*;

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

    public Enrollment() {

    }

    public Enrollment(Long id, String semster, String grade, Student student, Course course) {
        this.id = id;
        this.semster = semster;
        this.grade = grade;
        this.student = student;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSemster() {
        return semster;
    }

    public void setSemster(String semster) {
        this.semster = semster;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
