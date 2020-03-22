package com.example.demo.web;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.DTO.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * UserController
 */
@Controller
public class UserController {
    public List<User> users=new ArrayList<User>();

    @PostMapping("/create")
    public String create(User user){
        System.out.println(user.toString());
        users.add(user);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("users", users);
        return "list";
    }
    
}