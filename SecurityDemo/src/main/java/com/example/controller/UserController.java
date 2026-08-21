package com.example.controller;

import com.example.dto.UserRequestDto;
import com.example.dto.UserResponseDto;
import com.example.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final AuthService authService;
    public UserController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping("/Hello")
    public String hello() {
        return "Hello, World!";
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponseDto> register(@RequestBody UserRequestDto userRequestDto) {
       UserResponseDto userResponseDto = authService.register(userRequestDto);
        return ResponseEntity.ok(userResponseDto);
    }

}
