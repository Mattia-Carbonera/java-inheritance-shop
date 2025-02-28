package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private static int iva = 22;

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
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }
}
