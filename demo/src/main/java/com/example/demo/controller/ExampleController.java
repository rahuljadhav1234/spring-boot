package com.example.demo.controller;

import com.example.demo.user.User;
import org.springframework.web.bind.annotation.*;


@RestController
    @RequestMapping("/api")
    public class ExampleController {

        // POST: http://localhost:8080/api/user
        @PostMapping("/user")
        public String postByBody(@RequestBody User user) {
            return "Hello " + user.getName() + " (ID: " + user.getId() + ")";
        }
    }   