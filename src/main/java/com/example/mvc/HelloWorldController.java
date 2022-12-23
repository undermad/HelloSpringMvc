package com.example.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String fillForm(){
        return "hello-world-form";
    }

}
