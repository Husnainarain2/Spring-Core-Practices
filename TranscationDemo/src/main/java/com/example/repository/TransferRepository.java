package com.example.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends org.springframework.data.jpa.repository.JpaRepository<com.example.model.TransferRecord, Long> {
}
