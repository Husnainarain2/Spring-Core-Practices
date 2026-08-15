package com.example.repository;

import com.example.model.Department;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    public void  save(Department department){
//        entityManager.persist(department);
//    }
//    public Department findById(Long id){
//        return entityManager.find(Department.class, id);
//    }
    Optional<Department> findByName(String name);
}
