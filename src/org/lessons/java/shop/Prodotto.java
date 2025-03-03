package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    protected int codice;
    protected String nome;
    protected String marca;
    protected BigDecimal prezzo;
    protected static int iva = 22;

    // * costruttore
    public Prodotto(String nome, String marca, BigDecimal prezzo) {
        Random randomNumber = new Random();

        this.codice = randomNumber.nextInt(9999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
    }

    // * Metodi
    // codice
    public int getCodice() {
        return codice;
    }

    // nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // prezzo
    public BigDecimal getPrezzo() {
        return prezzo.setScale(2, RoundingMode .DOWN);
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    // toString
    public String toString() {
        return String.format("Prodotto %s, di marca %s, prezzo: " + this.getPrezzo() + "€", this.nome, this.marca);
    }
}
