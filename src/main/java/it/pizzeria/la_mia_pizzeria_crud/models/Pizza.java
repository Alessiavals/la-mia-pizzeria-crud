package it.pizzeria.la_mia_pizzeria_crud.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //------> marca la classe come entità*
@Table(name="Pizza") //----> identifica la tabella su DB*
public class Pizza {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //------> lo identifica come chiave primaria*
    private Integer id;

    @Column(unique=true, nullable=false)
    private String nome;
    
    @Column(length=50, nullable=false)
    private String ingredienti;

    @Column(nullable=false)
    private double prezzo;

    // -------- costruttori*
    public Pizza () {
        
    }

    public Pizza(String nome, String ingredienti, double prezzo) {
        this.nome = nome;
        this.ingredienti = ingredienti;
        this.prezzo = prezzo;
    }
    

    // --------- metodi *
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }



}
