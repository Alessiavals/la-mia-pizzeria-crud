package it.pizzeria.la_mia_pizzeria_crud.controllers;

import java.util.ArrayList;
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
    public String menu (Model model) {
       List<Pizza> listaPizzeRosse = new ArrayList<>();
       listaPizzeRosse.add(new Pizza("Margherita", "Pomodoro, Mozzarella, Basilico, Olio, Sale", 6.00));
       listaPizzeRosse.add(new Pizza("Marinara", "Pomodoro, Aglio, Origano, Olio e.o., Sale", 6.50));
       listaPizzeRosse.add(new Pizza("Diavola", "Pomodoro, Mozzarella, Salame Piccante, Olio e.o., Sale", 7.00));
        model.addAttribute("listaPizzeRosse", listaPizzeRosse);

        List<Pizza> listaPizzeBianche = new ArrayList<>();
        listaPizzeBianche.add(new Pizza("Biancaneve", "Mozzarella, Olio, Sale", 6.00));
        listaPizzeBianche.add(new Pizza("Patate e Salsiccia", "Mozzarella, Patate, Salsiccia, Olio e.o., Sale", 6.50));
        listaPizzeBianche.add(new Pizza("Paperino", "Mozzarella, Patatine, Wurstel, Olio e.o., Sale", 7.00));
        model.addAttribute("listaPizzeBianche", listaPizzeBianche);
        return "menu";
    }
    
}
