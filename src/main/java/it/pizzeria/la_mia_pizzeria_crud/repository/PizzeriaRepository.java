package it.pizzeria.la_mia_pizzeria_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.pizzeria.la_mia_pizzeria_crud.models.Pizza;

// ---> l'interfaccia vuole l'oggetto della repository + il tipo di chiave //

public interface PizzeriaRepository extends JpaRepository<Pizza, Integer>{

}
