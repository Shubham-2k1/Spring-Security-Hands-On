package com.practice.jwt.service;

import com.practice.jwt.configuration.webConfig;
import com.practice.jwt.security.customUserDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthenticationManager authManager;

    private String verify = "VERIFIED";
    private String not_verified = "NOT_VERIFIED";

    public String verifyLogin(String username, String password){

        Authentication auth = authManager.authenticate(new UsernamePasswordAuthenticationToken(username,password));

        if(auth.isAuthenticated()){
            return verify;
        }else{
            return not_verified;
        }
    }
}
