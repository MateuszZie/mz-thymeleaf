package org.mateuszziebura.mzthymeleaf.controllers;

import org.mateuszziebura.mzthymeleaf.domain.Product;
import org.mateuszziebura.mzthymeleaf.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/product")
    public String product(){
        return "redirect:/";
    }
    @RequestMapping("/product/{id}")
    public String getProduct(@PathVariable Integer id, Model model){
        Product product = productService.getProduct(id);
        model.addAttribute("product", product);
        return "product";
    }
}
