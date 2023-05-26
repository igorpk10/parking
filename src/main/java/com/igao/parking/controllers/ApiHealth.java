package com.igao.parking.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parkingspot/ping")
public class ApiHealth {

    @GetMapping
    public ResponseEntity<Object> ping (){
        return ResponseEntity.status(HttpStatus.OK).body("Pong");
    }
}
