package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;

    public String addUser(User us){
        String str = us.getFirstName().substring(0,2)+us.getMiddleName().substring(0,2)+us.getLastName().substring(0,2);
        int randomNumber = 100 + (int)(Math.random() * 900);
        String passW=str+randomNumber;
        us.setPassword(passW);
        userRepo.save(us);
        return "User added successfully";
    }
}