package it.pizzeria.la_mia_pizzeria_crud.controllers;

public class Pizza {
    
    private String nome;
    private String descrizione;
    private double prezzo;

    public Pizza (String nome, String descrizione, double prezzo) {
        nome = this.nome;
        descrizione = this.descrizione;
        prezzo = this.prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }


    

}
