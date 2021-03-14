package com.example.EurekaAuth.controller;

import com.example.EurekaAuth.security.JwtUsernameAndPasswordAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

public class AuthController {
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    JwtUsernameAndPasswordAuthenticationFilter jwtUsernameAndPasswordAuthenticationFilter;
    @PostMapping("/auth")
    public ResponseEntity<?> createUser(@Valid @RequestBody String username, String password){

    }
}
