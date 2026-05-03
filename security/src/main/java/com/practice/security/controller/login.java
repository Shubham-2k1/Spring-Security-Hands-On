package com.practice.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class login {


    @GetMapping("/loginSucess")
    public ResponseEntity<String> login(){
        return ResponseEntity.ok("Login Success!");
    }
}
