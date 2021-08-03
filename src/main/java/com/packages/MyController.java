package com.packages;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirstView(){
        return "start-view";
    }

    @RequestMapping("/askDetails")
    public String askemployeeDetails( Model model){

        model.addAttribute("employee", new Employee());
        return "ask-details-view";
    }


    @RequestMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "ask-details-view";
        }
        else {
            return "show-details-view";
        }

    }
}