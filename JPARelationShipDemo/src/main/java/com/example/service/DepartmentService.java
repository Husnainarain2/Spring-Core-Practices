package com.example.service;

import com.example.Mapper.EntityMapper;
import com.example.dto.request.DepartmentRequestDto;
import com.example.dto.response.DepartmentResponseDto;
import com.example.model.Department;
import com.example.repository.DepartmentRepository;
import jakarta.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private DepartmentRepository departmentRepository;
    private EntityMapper entityMapper;
    public DepartmentService(DepartmentRepository departmentRepository, EntityMapper entityMapper) {
        this.departmentRepository = departmentRepository;
        this.entityMapper = entityMapper;
    }

    @Transactional
    public void save(DepartmentRequestDto departmentRequestDto) {
        Department department = new Department();
        department.setName(departmentRequestDto.getDepartmentName());
        departmentRepository.save(department);
    }
@Transactional
    public DepartmentResponseDto getDepartmentById(Long id) {
        Department department = departmentRepository.findById(id).orElseThrow(() -> new RuntimeException("Department not found"));
        return entityMapper.toDepartmentResponseDto(department);
    }
}
