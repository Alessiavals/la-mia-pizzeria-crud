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

    private String ingredienti;
    private double prezzo;

    // -------- costruttori*
    public Pizza () {
        
    }

    public Pizza (String nome, String descrizione, double prezzo) {
        nome = this.nome;
        descrizione = this.ingredienti;
        prezzo = this.prezzo;
    }

    // --------- metodi *
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return ingredienti;
    }

    public void setDescrizione(String descrizione) {
        this.ingredienti = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }



}
