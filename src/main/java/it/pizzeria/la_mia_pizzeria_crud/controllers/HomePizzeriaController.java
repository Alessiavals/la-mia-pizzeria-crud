package it.pizzeria.la_mia_pizzeria_crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.pizzeria.la_mia_pizzeria_crud.models.Pizza;
import it.pizzeria.la_mia_pizzeria_crud.repository.PizzeriaRepository;


@Controller
@RequestMapping("/")
public class HomePizzeriaController {

    @Autowired
    private PizzeriaRepository pizzeriaRepository;

    @GetMapping("/menu")
    public String home (Model model) {
       List<Pizza> listapizze = pizzeriaRepository.findAll();
        model.addAttribute("listapizze", listapizze);
        return "menu";
    }
    
}
