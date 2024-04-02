package org.experis.learning;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
        this.iva = iva.divide(BigDecimal.valueOf(100), RoundingMode.HALF_DOWN);
    }

    // Metodi
    private int generaCodice(){
        Random rnd = new Random();

        return rnd.nextInt(1000) + 1;
    }

        // Getter e Setter
    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public BigDecimal getPrezzoCompleto(){
        return prezzo.add(prezzo.multiply(iva));
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }
}
