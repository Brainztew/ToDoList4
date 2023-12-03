package com.group4.group4;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
         model.addAttribute("tasks", taskList);
         return "todo";
    }

    @PostMapping("/addTask")
    public String addTask(@RequestParam("description") String description,@RequestParam("deadline") String deadline,Model model) {
        String taskWithDeadline = description + " - Deadline: " + deadline;
        taskList.add(taskWithDeadline);
        model.addAttribute("tasks", taskList);
        return "redirect:/tasks/todo";
    }


    @PostMapping("/removeTask")
    public String removeTask(@RequestParam("taskId") int taskId) {
        taskList.remove(taskId); //tar bort specifk task
        return "redirect:/todo"; 
    }

    
}



