package com.cl.usermanagement.controller;

import com.cl.usermanagement.Entity.User;
import com.cl.usermanagement.dto.UserDto;
import com.cl.usermanagement.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    userService service;
    @PostMapping("/save")
    public UserDto createUser(@RequestBody  UserDto user) {
        return service.createUser(user);
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        User user= service.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}


