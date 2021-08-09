package org.mateuszziebura.mzthymeleaf.controllers;

import org.mateuszziebura.mzthymeleaf.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final ProductService productService;

    public IndexController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("products", productService.listProducts());
        return "index";
    }
}
