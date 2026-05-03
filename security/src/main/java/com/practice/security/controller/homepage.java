package com.practice.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homepage {

    @GetMapping("/homepage")
    public ResponseEntity<String> getHomepage(){
        return ResponseEntity.ok("Welcome to Suppliment Shop!");
    }
}
