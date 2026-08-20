package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityBean {

    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
