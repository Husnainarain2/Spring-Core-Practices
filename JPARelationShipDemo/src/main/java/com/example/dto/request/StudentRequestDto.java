package com.example.dto.request;

import lombok.Data;

@Data
public class StudentRequestDto {
    private String name;
    private String email;

    private Long departmentId;
}
