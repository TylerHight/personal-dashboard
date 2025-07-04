package com.dashboard.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DashboardController {
    
    @GetMapping("/")
    public String dashboard(Model model) {
        model.addAttribute("message", "Welcome to Your Personal Dashboard!");
        return "dashboard";
    }
}
