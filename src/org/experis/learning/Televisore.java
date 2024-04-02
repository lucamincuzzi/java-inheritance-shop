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
            return "Sì";
        } else {
            return "No";
        }
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    @Override
    public String getInfoProdotto(){
        return super.getInfoProdotto() + " " + "Pollici: " + dimensioneSchermo + "Smart: " + isSmart();
    }
}
