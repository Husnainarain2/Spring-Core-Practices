package com.example.controller;

import com.example.model.Department;
import com.example.model.Student;
import com.example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping("Api/Students/Department")
public class DepartmentController {
    private DepartmentService  departmentService;
    @Autowired
    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    @PostMapping
    public ResponseEntity<String> createDepartment(@RequestBody Department department){
        departmentService.createDepartment(department);
        return ResponseEntity.ok("Department created successfully");
    }
    @PostMapping("/withStudent")
    public ResponseEntity<String> createDepartmentWithStudent(@RequestBody Department department, @RequestParam String studentName){
        departmentService.createDepartmentWithStudent(department,studentName);
        return ResponseEntity.ok("Department with student created successfully");
    }
}
