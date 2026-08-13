package com.example.controller;

import com.example.dto.DepartmentRequestDto;
import com.example.dto.DepartmentResponseDto;
import com.example.service.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Api/department")
public class DepartmenrController {
    private DepartmentService departmentService;

    public DepartmenrController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public ResponseEntity<String> addDepartment(@RequestBody DepartmentRequestDto department) {
        departmentService.save(department);
        return ResponseEntity.ok("Create " +
                "departmet");
    }
    @GetMapping("/{id}")
    public ResponseEntity<DepartmentResponseDto> getDepartment(@PathVariable Long id) {
        DepartmentResponseDto responseDto= departmentService.getDepartmentById(id);
        if (responseDto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(responseDto);
    }

}
