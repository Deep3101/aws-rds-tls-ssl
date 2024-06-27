package com.springbootrdsdemo.controller;

import com.springbootrdsdemo.entity.User;
import com.springbootrdsdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/get")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public User getUserById(@PathVariable Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
