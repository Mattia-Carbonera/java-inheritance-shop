package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    String color;
    boolean isWireless;

    // * costruttori
    public Cuffie(String nome, String marca, BigDecimal prezzo, String color, boolean isWireless) {
        super(nome, marca, prezzo);
        this.color = color;
        this.isWireless = isWireless;
    }

    // * metodi
    // color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // isWireless
    public String getIsWireless() {
        if(isWireless) {
            return "Queste cuffie sono wireless";
        } else {
            return "Queste cuffie sono cablate";
        }
    }

    public void setIsWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }
    
}
