package it.pizzeria.la_mia_pizzeria_crud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class HomePizzeriaController {

    @GetMapping("/home")
    public String home (Model model) {
       
        model.addAttribute("Margherita");
        return "home";
    }
    
}
