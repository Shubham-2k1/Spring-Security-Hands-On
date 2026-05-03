package com.practice.security.controller;

import com.practice.security.entity.category;
import com.practice.security.service.implementation.categoryServiceImpl;
import com.practice.security.service.implementation.itemServiceImpl;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class clientController {

    @Autowired
    private categoryServiceImpl categoryService;

    @Autowired
    private itemServiceImpl itemService;

    @GetMapping("/category")
    public List<String> getCategory(){
        return categoryService.getCategories();
    }

    @GetMapping("/item/{category}")
    public List<String> getItem(@PathVariable String category){
        return itemService.getItem(category);
    }
}
