package org.experis.learning;

import java.math.BigDecimal;

public class Cuffia extends Prodotto{
    // Attributi
    private String colore;
    private boolean isWireless;

    // Costruttori

    public Cuffia(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String colore, boolean isWireless) {
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.isWireless = isWireless;
    }

    // Metodi

        // Getter e Setter

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String isWireless() {
        if(isWireless){
            return "Sono cuffie wireless";
        } else {
            return "Sono cuffie cablate";
        }
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }
}
