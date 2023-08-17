package com.example.testtask.controller;

import com.example.testtask.entity.UserEntity;
import com.example.testtask.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class MainController {

    UserService userService;


    @GetMapping("")
    public String hello(Model model) {
        model.addAttribute("users",userService.getAllUsers());
        return "hello";
    }

    @GetMapping("/login")
    public String login() {
        return "login";

    }


    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userEntity", new UserEntity());
        return "/registration";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("userEntity") UserEntity user) {
        userService.save(user);
        return "redirect:/login";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id, Model model) {
        userService.delete(id);
        return "redirect:/";
    }
}
