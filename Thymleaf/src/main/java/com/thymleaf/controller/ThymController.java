package com.thymleaf.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@Controller
public class ThymController {
    @GetMapping(value="/about")
    public String about(Model model){
        System.out.println("Inside about Controller....");
        // Add data to model
        model.addAttribute("name", "Harsh Chauhan");
        model.addAttribute("age","21");
        model.addAttribute("date",new Date());
        return "about";
        // This Function Returns about.html
    }
    // For Iteration
    @GetMapping("/loop")
    public String iteration(Model m){
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Harsh", "Satya", "Rishav"));
        m.addAttribute("name", names);
        return "iter";
    }

}
