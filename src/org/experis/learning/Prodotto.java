package org.experis.learning;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {
    // Attributi
    private int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva;

    // Costruttori

    public Prodotto(String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        this.codice = generaCodice();
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // Metodi

    private int generaCodice(){
        Random rnd = new Random();

        return rnd.nextInt(1000) + 1;
    }
}
