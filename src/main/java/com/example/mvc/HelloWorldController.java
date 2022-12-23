package com.example.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String fillForm() {
        return "hello-world-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "hello-world";
    }

    // new controller method to process data
    // and store it in model
    @RequestMapping("processFormVersionTwo")
    public String callMeEctimel(HttpServletRequest request, Model model) {
        String studentName = request.getParameter("studentName");
        studentName = studentName.toUpperCase();
        String message = "Greetings from Ectimel! Welcome " + studentName;
        model.addAttribute("message", message);
        return "hello-world";
    }

    @RequestMapping("processFormVersionThree")
    public String callMeEctimelPlease(@RequestParam("studentName") String studentName,
                                      Model model) {
        studentName = studentName.toUpperCase();
        String message = "Greetings from Ectimel! Welcome " + studentName;
        model.addAttribute("message", message);
        return "hello-world";
    }


}
