package com.example.service;

import com.example.model.Department;
import com.example.repository.DepartmentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private DepartmentRepository departmentRepository;
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
    @Transactional
    public void createDepartment(Department department) {
        departmentRepository.save(department);
    }
}


