package com.practice.security.repository;

import com.practice.security.entity.stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface stockRepo extends JpaRepository<stock, Long> {
}
