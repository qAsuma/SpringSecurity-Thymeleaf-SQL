package com.example.testtask.controller;

import com.example.testtask.entity.UserEntity;
import com.example.testtask.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MainController {
     UserService userService;


    @GetMapping("")
    public String hello() {

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

}
