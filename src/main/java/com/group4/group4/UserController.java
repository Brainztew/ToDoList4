package com.group4.group4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class UserController {

    static List<User> userList = new ArrayList<>();

    public static List<User> getUserList() {
        return userList;
    }

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

    @GetMapping("/todo/{firstName}/{listIndex}")
    public String todoPage(@PathVariable String firstName, @PathVariable int listIndex, Model model) {
        User user = findUserFirstName(firstName);
        ListInfo listInfo = user.getLists().get(listIndex);
        
        model.addAttribute("listName", listInfo.getName());
        model.addAttribute("user", user);
        model.addAttribute("tasks", listInfo.getTasks());

        return "todo";
    }

        // Ta bort
    @GetMapping("/remove-user/{firstName}")
    public static String removeMember(@PathVariable String firstName) {
        userList.remove(findUserFirstName(firstName)); 
        return "redirect:/addUser";
    }

    // Rensa
    @GetMapping("/clear-user/{firstName}")
    public static String clearMember(@PathVariable String firstName) {
        userList.clear();
        return "redirect:/addUser";
    }

    public static User findUserFirstName(String firstName) {
        for (User user : userList) {
            if (user.getFirstName().equals(firstName)) {
                return user;
            }
        }
        return null;
    }

    // Ändra
    @PostMapping("/change-user/{firstName}")
    public String changeUserForm(@PathVariable String firstName, @ModelAttribute User user, Model model) {
        User changeUser = findUserFirstName(firstName);
        changeUser.setFirstName(user.getFirstName());
        model.addAttribute("userChange", changeUser);
        return "redirect:/addUser";
    }

/*     @PostMapping("/change-user")
    public String changeUser (@ModelAttribute("userChange") User changed, Model model) {
        User exist = findUserFirstName(changed.getFirstName());

        if (exist != null) {
            exist.setNewFirstName(changed.getNewFirstName());
            // userList.remove(exist);
            userList.add(exist);
        } 
            model.addAttribute("user", exist);      
            return "redirect:/addUser";
    } */
}