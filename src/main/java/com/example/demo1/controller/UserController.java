package com.example.demo1.controller;

import com.example.demo1.entity.User;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping(value = "/getUser")
    public String  GetUser(@RequestParam(name = "id") int id, Model model){
        User user=userService.Sel(id);
        model.addAttribute("user",user);
        return "index";
    }
}
