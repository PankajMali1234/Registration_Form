package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
    
    @Autowired
    private UserService usServ;

    @PostMapping("addUser")
    public String addUser(@RequestBody User us){
        return usServ.addUser(us);
    }
}