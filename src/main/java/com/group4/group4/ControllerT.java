package com.group4.group4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerT {

    // Home page
    @GetMapping("/home")
    String getHome(){
        return "home";
    }

    
}
