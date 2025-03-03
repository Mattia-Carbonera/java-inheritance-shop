package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    // ! RICORDATI DI FARE IL MERGE
    public static void main(String[] args) {
        Prodotto prodottoUno = new Prodotto("nomeUno", "marcaUno", new BigDecimal(224.3));
        System.out.println(prodottoUno.getPrezzo());

        // System.out.println(prodottoUno.toString());

        System.out.println("--------------------------------------------------");
        System.out.println("smartphoneUno");
        Smarphone iPhone = new Smarphone("iPhone", "Apple", new BigDecimal(1449), "aff36a7d7f27d8", 256);
        // System.out.println(iPhone.getImei());
        // System.out.println(iPhone.getNome());
        // System.out.println(iPhone.getPrezzo());
        System.out.println(iPhone.toString());

        System.out.println("--------------------------------------------------");
        System.out.println("televisoreUno");
        Televisori SamsungTv = new Televisori("Neo QLED 4k ", "Samsung", new BigDecimal(1299.99), 0, true);
        // System.out.println(SamsungTv.getIsSmartTv());
        // System.out.println(SamsungTv.getNome());
        // System.out.println(SamsungTv.getPrezzo());
        System.out.println(SamsungTv.toString());

        System.out.println("--------------------------------------------------");
        System.out.println("CuffuaUno");
        Cuffie cuffiaBitz = new Cuffie("Powerbeats Pro 2", "Bitz", new BigDecimal(69.99), "nero", false);
        // System.out.println(cuffiaBitz.getIsWireless());
        // System.out.println(cuffiaBitz.getNome());
        // System.out.println(cuffiaBitz.getPrezzo());
        System.out.println(cuffiaBitz.toString());

    }
}
