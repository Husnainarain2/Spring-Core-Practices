package com.example.service;

import com.example.dto.UserRequestDto;
import com.example.dto.UserResponseDto;
import com.example.entity.Role;
import com.example.entity.User;
import com.example.repository.RoleRepository;
import com.example.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthService(UserRepository userRepository, RoleRepository roleRepository,PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public UserResponseDto register(UserRequestDto userRequestDto) {
        String hashedPassword =
                passwordEncoder.
                        encode(userRequestDto.getPassword());

        User user = new User();
        user.setUsername(userRequestDto.getUsername());
        user.setPassword(hashedPassword);
        user.setEnabled(true);
        Role role = roleRepository.findByName(
                "User-role")
                .orElseThrow(() -> new RuntimeException("Role not found"));
        user.getRoles().add(role);
        userRepository.save(user);

        UserResponseDto userResponseDto =
                new UserResponseDto();
        userResponseDto.setUsername(user.getUsername());
        userResponseDto.setMessage("User saved successfully");
        return userResponseDto;


    }

//    public boolean authenticate(UserRequestDto userRequestDto) {
//        User user = userRepository.findByUsername(userRequestDto.getUsername())
//                .orElseThrow(() -> new RuntimeException("User not found"));
//        String encodedPassword = user.getPassword();
//        return passwordEncoder.matches(userRequestDto.getPassword(), encodedPassword);
//    }
}
