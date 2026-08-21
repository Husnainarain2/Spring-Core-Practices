package com.example.service;

import com.example.entity.Role;
import com.example.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role createRole(Role role) {
        // Save the role to the database
        return roleRepository.save(role);
    }
}
