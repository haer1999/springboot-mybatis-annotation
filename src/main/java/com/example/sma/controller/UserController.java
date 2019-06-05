package com.example.sma.controller;

import com.example.sma.dao.UserDao;
import com.example.sma.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @PostMapping("/addUser")
    public String addUser(String name, int age) {
        userDao.save(name, age);
        return "Success";
    }

    @PostMapping("getUserByName")
    public Object getUserByName(String name) {
        User user = userDao.getUser(name);
        return user;
    }

}
