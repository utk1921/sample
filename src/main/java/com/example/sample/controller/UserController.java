package com.example.sample.controller;

import com.example.sample.entity.UserRecord;
import com.example.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping
    public List<UserRecord> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @RequestMapping(value="add/user", method= RequestMethod.POST)
    public void addUser(@RequestBody UserRecord userRecord)
    {
        userService.addUser(userRecord);
    }
}
