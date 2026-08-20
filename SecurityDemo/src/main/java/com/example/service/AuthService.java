package com.example.service;

import com.example.dto.UserRequestDto;
import com.example.dto.UserResponseDto;
import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder= new BCryptPasswordEncoder();

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponseDto register(UserRequestDto userRequestDto) {
        // Hash the password
        String hashedPassword = passwordEncoder.encode(userRequestDto.getPassword());

        // Create a new user entity and save it to the database
        User user = new User();
        user.setUsername(userRequestDto.getUsername());
        user.setPassword(hashedPassword);
        userRepository.save(user);

        // Return a response DTO
        UserResponseDto responseDto = new UserResponseDto();
        responseDto.setUsername(user.getUsername());
        responseDto.setMessage("User registered successfully");
        return responseDto;
    }

    public boolean authenticate(UserRequestDto userRequestDto) {
        User user = userRepository.findByUsername(userRequestDto.getUsername())
                .orElseThrow(() -> new RuntimeException("User not found"));
        String encodedPassword = user.getPassword();
        return passwordEncoder.matches(userRequestDto.getPassword(), encodedPassword);
    }
}
