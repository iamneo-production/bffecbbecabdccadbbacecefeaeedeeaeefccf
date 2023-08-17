package com.example.springapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
public class ApiController {

    @GetMapping("/")
    public ResponseEntity<String> Welcome(){
        return ResponseEntity.status(200).body("Welcome String Boot!");
    }
}
