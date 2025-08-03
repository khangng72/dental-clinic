package com.pk.dentalclinic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitialController {

    @GetMapping
    public ResponseEntity<String> testAPI() {
        return ResponseEntity.ok("Hello World");
    }
}
