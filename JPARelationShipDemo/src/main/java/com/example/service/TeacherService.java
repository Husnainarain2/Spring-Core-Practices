package com.example.service;

import com.example.dto.request.TeacherRequestDto;
import com.example.model.Department;
import com.example.model.Teacher;
import com.example.repository.DepartmentRepository;
import com.example.repository.TeacherRepository;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;
    private final DepartmentRepository departmentRepository;

    public TeacherService(TeacherRepository teacherRepository, DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
        this.teacherRepository = teacherRepository;
    }

    public void createTeacher(  TeacherRequestDto teacherResquestDto) {
        Department department = departmentRepository.findById(teacherResquestDto.getDepartmentId());
        if (department == null) {
            throw new IllegalArgumentException("Department not found with id: " + teacherResquestDto.getDepartmentId());
        }

        Teacher teacher = new Teacher();
        teacher.setName(teacherResquestDto.getName());
        teacher.setDepartment(department);
        teacherRepository.save(teacher);
    }
}
