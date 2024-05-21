package com.example.demo.service;

import com.example.demo.Exception.UserNotFoundException;


import com.example.demo.model.User;


import com.example.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User addUser(User user) {

        return userRepo.save(user);
    }

    public List<User> findAllUsers() {
        return userRepo.findAll();
    }

    public User updateUser(User user) {
        return userRepo.save(user);
    }

    public User findUserById(Long id) {
        return userRepo.findUserById(id).orElseThrow(() -> new UserNotFoundException("user not found"));
    }

    public void deleteUser(String email) {
        userRepo.deleteUserByEmail(email);

    }


    public User findUserByEmail(String email) {
        return userRepo.findUserByEmail(email).orElseThrow(() -> new UserNotFoundException("user not found"));
    }
}



