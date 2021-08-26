package org.mateuszziebura.mzthymeleaf.controllers;

import org.mateuszziebura.mzthymeleaf.domain.Loged;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class LogInController {


    @RequestMapping("/login")
    public String logIn(Model model){

        model.addAttribute("loged", new Loged());
        return "LogIn";
    }
    @RequestMapping("logout-success")
    public String yourLoggedOut(){

        return "logout-success";
    }
//    @PostMapping("/login")
    public String successLog(@Valid Loged loged, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "LogIn";
        }
        return "redirect:index";
    }
}
