package com.group4.group4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;



public class UserController {
     private List<User> userList = new ArrayList<>();




    @GetMapping("/addUser")
    public String addUserForm( Model model) {
        model.addAttribute("user", new User());
        return "redircet:/";
    }

    @PostMapping("/addUser")
    public String addUser(User user) {
        userList.add(user);
        return "redirect:/";
    }
    
}
