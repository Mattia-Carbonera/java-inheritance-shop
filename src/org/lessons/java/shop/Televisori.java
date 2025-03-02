package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto {
    protected int pollici;
    protected boolean isSmartTv;

    // * metodi
    public Televisori(String nome, String marca, BigDecimal prezzo, int pollici, boolean isSmartTv) {
        super(nome, marca, prezzo);
        this.pollici = pollici;
        this. isSmartTv = isSmartTv;
    }

    // * metodi
    // pollici
    public int getPollici() {
        return pollici;
    }

    public void setPollici(int pollici) {
        this.pollici = pollici;
    }

    // isSmartTv
    public String getIsSmartTv() {
        if(isSmartTv) {
            return "Questo televisore supporta la tecnologia 'Smart'";
        } else {
            return "Questo televisore non supporta la tecnologia 'Smart'";
        }
    }

    public void setIsSmartTv(boolean setIsSmartTv) {
        this.isSmartTv = isSmartTv;
    }

    // toString
    public String toString() {
        String tvIsSmart = isSmartTv ? "smart TV" : "non smart TV";
        return String.format("Televisore %s, %s, prezzo: " + this.getPrezzo() + "€", this.nome, tvIsSmart);
    }
    
}
