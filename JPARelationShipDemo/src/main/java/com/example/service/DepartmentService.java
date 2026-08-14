package com.example.service;

import com.example.dto.request.DepartmentRequestDto;
import com.example.dto.response.DepartmentResponseDto;
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
    public void save(DepartmentRequestDto departmentRequestDto) {
        Department department = new Department();
        department.setName(departmentRequestDto.getDepartmentName());
        departmentRepository.save(department);
    }
@Transactional
    public DepartmentResponseDto getDepartmentById(Long id) {
        Department department =
                departmentRepository.findById(id);
        if (department == null) {
            return null;
        }
        DepartmentResponseDto departmentResponseDto = new DepartmentResponseDto();
        departmentResponseDto.setId(department.getId());
        departmentResponseDto.setName(department.getName());
        return departmentResponseDto;
    }
}
