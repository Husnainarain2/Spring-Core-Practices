package com.example.repository;

import org.springframework.stereotype.Repository;

import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
