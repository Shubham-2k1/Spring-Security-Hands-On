package com.practice.jwt.controller;


import com.practice.jwt.entity.User;
import com.practice.jwt.service.AuthService;
import com.practice.jwt.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    private final UserService userService;

    @PostMapping("/login/{username}/{password}")
    public ResponseEntity<String> getLogin(@PathVariable String username, @PathVariable String password){
        String response = authService.verifyLogin(username, password);
        if(response.equals("VERIFIED")){
            return ResponseEntity.ok(response);
        }else{
            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping("/onlyVerify")
    public ResponseEntity<String> getVerify(){
        return ResponseEntity.ok("Congrats");
    }

    @PostMapping("/addUser/{username}/{password}")
    public ResponseEntity<String> saveUser(@PathVariable String username, @PathVariable String password){
            User user = userService.saveUser(username,password);
            if(user != null){
                return ResponseEntity.ok("Created");
            }
            else{
                return ResponseEntity.badRequest().body("Not Created");
            }
    }
}
