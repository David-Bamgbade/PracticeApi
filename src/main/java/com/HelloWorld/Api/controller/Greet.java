package com.HelloWorld.Api.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Greet {

    @GetMapping("/greet/{name}")
    public ResponseEntity <?> greetPerson(@PathVariable ("name") String name) {
       try {
           return ResponseEntity.ok("Hello " + name);
       }
       catch (Exception e) {
           return ResponseEntity.badRequest().body(e.getMessage());
       }
    }


}





