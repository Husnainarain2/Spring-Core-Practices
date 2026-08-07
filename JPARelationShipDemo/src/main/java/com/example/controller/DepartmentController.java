package com.example.controller;

import com.example.model.Department;
import com.example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
