package com.example.springapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
public class ApiController {
    @GetMapping("/welcome")
    public ResponseEntity<String> Welcome(){
        return RespnseEntity.status(200).body("Welcome String Boot!");
    }
}
