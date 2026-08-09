package com.example.repository;

import com.example.model.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Student student){
        entityManager.persist(student);
    }
    public Student getById(Long Id){
        return entityManager.find(Student.class,Id);
    }
    public Student getAll(){
        List<Student> students=
                entityManager.createQuery("from Student s",Student.class).getResultList();
        return students;
    }
}
