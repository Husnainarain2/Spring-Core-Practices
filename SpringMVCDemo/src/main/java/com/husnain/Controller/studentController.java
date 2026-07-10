package com.husnain.Controller;

import com.husnain.Entity.Student;
import com.husnain.Service.studentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class studentController {
    private studentService studentService;

    public studentController(studentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student studentReq) {
        studentService.saveStudent(studentReq);
        return ResponseEntity.ok(studentReq);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id) {
        Student student = studentService.findStudentById(id);
        if (student == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(student);
    }
    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(studentService.findAllStudents());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        boolean deleted = studentService.deleteStudentById(id);
        if (deleted) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student studentReq) {
        Student existingStudent = studentService.updateStudent(id, studentReq);
        if (existingStudent == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(existingStudent);
    }
}
