package com.group4.group4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    private List<String> taskList = new ArrayList<>();

    @GetMapping("/todo")
    public String getTodoPage(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        model.addAttribute("tasks", taskList);

        return "todo";
    }

    @PostMapping("/addTask/{firstName}/{listIndex}")
    public String addTask(@PathVariable String firstName, @PathVariable int listIndex, @RequestParam String description, @RequestParam String deadline, Model model) {
        User user = UserController.findUserFirstName(firstName);
        ListInfo listInfo = user.getLists().get(listIndex);
        String taskDetails =  "Att göra: " +  description + ", Deadline: " + deadline;
        listInfo.getTasks().add(taskDetails); 
        
        model.addAttribute("user", user);
        model.addAttribute("listName", listInfo.getName());
        model.addAttribute("tasks", listInfo.getTasks());
        return "redirect:/todo/{firstName}/{listIndex}";
    }
    @PostMapping("/removeTask/{firstName}/{listIndex}/{taskIndex}")
    public String removeTask(@PathVariable String firstName, @PathVariable int listIndex, @PathVariable int taskIndex, Model model) {
        User user = UserController.findUserFirstName(firstName);
        ListInfo listInfo = user.getLists().get(listIndex);
        
        if (taskIndex >= 0 && taskIndex < listInfo.getTasks().size()) {
            listInfo.getTasks().remove(taskIndex);
        }
        model.addAttribute("user", user);
        return "redirect:/todo/{firstName}/{listIndex}"; 
    }
}



