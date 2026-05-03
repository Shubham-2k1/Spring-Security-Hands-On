package com.practice.security.repository;

import com.practice.security.entity.item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface itemRepo extends JpaRepository<item, Long> {
    List<item> findByCategory(String category);
}
