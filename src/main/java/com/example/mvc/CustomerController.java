package com.example.mvc;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    // add @InitBinder to trim input Strings
    // this method will be call for every request came in to the controller
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);

    }

    @RequestMapping("/showForm")
    public String showCustomerForm(Model model) {

        model.addAttribute("customer", new Customer());
        return "customer-form";

    }


    @RequestMapping("/processForm")
    public String processForm(@Valid
                              @ModelAttribute("customer")
                              Customer customer,
                              BindingResult bindingResult) {

        System.out.println("Customer first name: |" + customer.getFirstName() + "|");
        System.out.println("Customer last name: |" + customer.getLastName() + "|");

        if (bindingResult.hasErrors())
            return "customer-form";
        else
            return "customer-confirmation";

    }


}
