package com.example.repository;

import com.example.model.Enrollment;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class EnrollmentRepository {
    @PersistenceContext
    private EntityManager em;

    public void save(Enrollment enrollment) {
        em.persist(enrollment);
    }
}
