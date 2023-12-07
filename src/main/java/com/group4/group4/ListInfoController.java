package com.group4.group4;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ListInfoController {
    public ListInfoController(UserController userController) {
    }

    @GetMapping("/userList/{firstName}")
    public String todo(@PathVariable String firstName, Model model) {
        User user = UserController.findUserFirstName(firstName);
        model.addAttribute("user", user);
        return "userList"; 
    }

    @PostMapping("/addList/{firstName}")
    public String addList(@PathVariable String firstName, @RequestParam String newListName, Model model) {
        User user = UserController.findUserFirstName(firstName);
        ListInfo newListInfo = new ListInfo(newListName, new ArrayList<>());
        user.getLists().add(newListInfo);
        model.addAttribute("user", user);
        return "userList";
    }


    @GetMapping("/remove-list/{firstName}/{listIndex}")
    public String removeList(@PathVariable String firstName, @PathVariable int listIndex, Model model) {
        User user = UserController.findUserFirstName(firstName);
        user.getLists().remove(listIndex);
        model.addAttribute("user", user);
        return "redirect:/userList/{firstName}";
    }
    @PostMapping("/change-list/{firstName}/{listIndex}")
public String changeListForm(@PathVariable String firstName, @PathVariable int listIndex,
    @RequestParam String newListName, Model model) {
        User user = UserController.findUserFirstName(firstName);
        ListInfo listinfo = user.getLists().get(listIndex);
        listinfo.setName(newListName);

        model.addAttribute("userChange", user);
        model.addAttribute("getList", listinfo.getName());
        return "redirect:/userList/{firstName}";
    }
}