package com.geekster.Instagram.controllers;

import com.geekster.Instagram.models.Post;
import com.geekster.Instagram.models.User;
import com.geekster.Instagram.repositories.IUserRepository;
import com.geekster.Instagram.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
@Autowired
IUserRepository userRepository;
@Autowired
    IUserService userService;

    @PostMapping(value = "/signIn")
    void signIn(@RequestBody User user){
        userRepository.save(user);
    }
   @GetMapping (value = "/signUp")
    public User signUp(){
        return userService.getAll();
   }
}
