package com.practice.security.repository;

import com.practice.security.entity.category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface categoryRepo extends JpaRepository<category, Long> {
}
