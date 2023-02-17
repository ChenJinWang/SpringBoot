package com.example.testspringboot.controller;

import com.example.testspringboot.dao.UserDao;
import com.example.testspringboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/a")
    public List<User> findAll(){
        return userDao.getAllBy();
    }
}
