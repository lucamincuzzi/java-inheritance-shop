package org.experis.learning;

import java.math.BigDecimal;

public class Televisore extends Prodotto{
    // Attributi
    private int dimensioneSchermo;
    private boolean isSmart;

    // Costruttori

    public Televisore(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int dimensioneSchermo, boolean isSmart) {
        super(nome, marca, prezzo, iva);
        this.dimensioneSchermo = dimensioneSchermo;
        this.isSmart = isSmart;
    }

    // Metodi

        // Getter e Setter

    public String getDimensioneSchermo() {
        return dimensioneSchermo + "''";
    }

    public void setDimensioneSchermo(int dimensioneSchermo) {
        this.dimensioneSchermo = dimensioneSchermo;
    }

    public String isSmart() {
        if(isSmart){
            return "È un televisore smart";
        } else {
            return "Non è un televisore smart";
        }
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }
}
