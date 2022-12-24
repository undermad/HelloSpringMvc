package com.example.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ectimel")
public class EctimelController {

    @RequestMapping("/showHelloWorld")
    public String showEctimel(){
        return "hello-world";
    }
}
