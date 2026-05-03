package com.practice.security.service.implementation;

import com.practice.security.entity.category;
import com.practice.security.repository.categoryRepo;
import com.practice.security.service.categoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class categoryServiceImpl implements categoryService {

    private final categoryRepo categoryRepo;

    @Override
    public List<String> getCategories() {
        return categoryRepo.findAll().stream()
                .map(category::getCategory)
                .collect(Collectors.toList());
    }
}
