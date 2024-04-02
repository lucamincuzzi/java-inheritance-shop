package org.experis.learning;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Prodotto{
    // Attributi
    private int codiceIMEI;
    private int memoria;

    // Costruttori
    public Smartphone(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int memoria) {
        super(nome, marca, prezzo, iva);
        this.codiceIMEI = generaIMEI();
        this.memoria = memoria;
    }

    // Metodi
    private int generaIMEI(){
        Random rnd = new Random();

        return rnd.nextInt(1000000000);
    }

        // Getter e Setter
    public int getCodiceIMEI() {
        return codiceIMEI;
    }

    public String getMemoria() {
        return memoria + "GB";
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String getInfoProdotto() {
        return super.getInfoProdotto() + " " + "IMEI: " + codiceIMEI + " " + "Memoria: " + memoria;
    }
}
