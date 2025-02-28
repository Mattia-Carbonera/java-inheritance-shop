package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto prodottoUno = new Prodotto("nomeUno", "marcaUno", new BigDecimal(224.3));
        System.out.println(prodottoUno.getPrezzo());
    }
}
