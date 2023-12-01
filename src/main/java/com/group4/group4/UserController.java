package com.group4.group4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class UserController {

    private static List<User> userList = new ArrayList<>();

    @GetMapping("/addUser")
    public String addUserForm(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("userList", userList);
        return "addUserForm";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("user") User user, Model model) {
        userList.add(user);
        model.addAttribute("userList", userList);
        return "redirect:/addUser";
    }

    @GetMapping("/todo/{firstName}")
    public String todoDetails(@PathVariable String firstName, Model model) {
        User user = findUserFirstName(firstName);
        model.addAttribute("user", user);
        return "todo"; 
    }

    public static User findUserFirstName(String firstName) {
        for (User user : userList) {
            if (user.getFirstName().equals(firstName)) {
                return user;
            }
        }
        return null;
    }
}