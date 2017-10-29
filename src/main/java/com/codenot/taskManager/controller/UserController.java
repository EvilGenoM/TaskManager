package com.codenot.taskManager.controller;

import com.codenot.taskManager.model.HibernateUser;
import com.codenot.taskManager.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String index() {

        Iterable<HibernateUser> users = userRepository.findAll();
        String userStr = "";

        for (HibernateUser user : users){

            userStr += user.email;

        }

        return userStr;

    }

    @GetMapping("/add")
    public String add(String email, String password){

        email = "lalas@ss";
        password = "12345";

        HibernateUser user = new HibernateUser();
        user.email = email;
        user.password = password;
        userRepository.save(user);

        return "Success";

    }

}
