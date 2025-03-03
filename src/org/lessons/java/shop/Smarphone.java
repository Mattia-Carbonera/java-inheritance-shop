package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Smarphone extends Prodotto {
    protected String imei;
    protected int capacitaMemoria;

    // * costruttori
    public Smarphone(String nome, String marca, BigDecimal prezzo, String imei, int capacitaMemoria) {
        super(nome, marca, prezzo);
        this.imei = imei;
        this.capacitaMemoria = capacitaMemoria;
    }

    // * metodi
    //imei
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    // capacità memoria
    public int getCapacitaMemoria() {
        return capacitaMemoria;
    }

    public void setCapacitaMemoria(int capacitaMemoria) {
        this.capacitaMemoria = capacitaMemoria;
    }

    // toString
    @Override
    public String toString() {
        return String.format("%s con %d Gb di memoria, prezzo: " + this.getPrezzo() + "€", this.nome, this.capacitaMemoria);
    }


}
