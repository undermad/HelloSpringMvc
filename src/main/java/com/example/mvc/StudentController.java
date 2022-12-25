package com.example.mvc;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Value("#{countriesProperties}")
    private Map<String, String> countriesProperties;

    @Value("#{favouriteLanguages}")
    private Map<String, String> favouriteLanguages;

    private String[] operatingSystems = {"Windows", "Linux", "Android"};

    @RequestMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("student", new Student());
        model.addAttribute("countriesProperties", countriesProperties);
        model.addAttribute("favouriteLanguages", favouriteLanguages);
        model.addAttribute("operatingSystems", operatingSystems);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String login(@ModelAttribute("student") Student student){
        return "student-confirmation";
    }

}
