package com.github.KdAndrade.coinsync.controller;

import com.github.KdAndrade.coinsync.repository.UserRepository;
import com.github.KdAndrade.coinsync.user.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> list() {
        return userRepository.findAll();
    }
}
