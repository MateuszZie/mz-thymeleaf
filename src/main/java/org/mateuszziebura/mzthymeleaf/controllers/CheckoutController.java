package org.mateuszziebura.mzthymeleaf.controllers;

import org.mateuszziebura.mzthymeleaf.comands.CheckoutCommand;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class CheckoutController {

    @RequestMapping("/checkout")
    public String checkoutForm(){
        return "checkoutform";
    }

    @PostMapping("/docheckout")
    public String doCheckout(@Valid CheckoutCommand checkoutCommand, BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            return "checkoutform";
        }

        return "checkoutcomplete";

    }

}
