package com.example.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class StudentRepository {
    @PersistenceContext
    private EntityManager em;

}
