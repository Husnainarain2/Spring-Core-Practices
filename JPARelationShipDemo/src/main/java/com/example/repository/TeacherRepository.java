package com.example.repository;

import com.example.model.Teacher;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public class TeacherRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Teacher teacher){
        entityManager.persist(teacher);
    }
    public Teacher findById(Long id) {
        return entityManager.find(Teacher.class, id);
    }

}
