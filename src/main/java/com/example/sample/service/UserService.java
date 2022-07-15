package com.example.sample.service;

import com.example.sample.entity.UserRecord;
import com.example.sample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<UserRecord> getAllUsers()
    {
        List<UserRecord>userRecords = new ArrayList<>();
        userRepository.findAll().forEach(userRecords::add);
        return userRecords;
    }

    public void addUser(UserRecord userRecord)
    {
        userRepository.save(userRecord);
    }
}
