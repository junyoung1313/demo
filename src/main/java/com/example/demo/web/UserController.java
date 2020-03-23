package com.example.demo.web;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.domain.User;
import com.example.demo.domain.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * UserController
 */
@Controller
@RequestMapping("/users")
public class UserController {
    public List<User> users=new ArrayList<User>();

    @Autowired
    public UserRepository userRepository;

    @GetMapping("/form")
    public String create(){
        return "/user/form";
    }

    @PostMapping("")
    public String create(User user){
        //users.add(user);
        userRepository.save(user);
        return "redirect:/users";
    }

    @GetMapping("")
    public String list(Model model){
        
        model.addAttribute("users", userRepository.findAll());
        return "/user/list";
    }
    @GetMapping("/{id}/form")
    public String udpate(@PathVariable Long id, Model model){
        User user=userRepository.findById(id).get();
        model.addAttribute("user", user);
        return "/user/updateForm";
    }
    
    @PutMapping("/{id}/update")
    public String update(@PathVariable Long id, User newUser){
        User user=userRepository.findById(id).get();
        user.update(newUser);
        userRepository.save(user);
        return"redirect:/users";

    }
}