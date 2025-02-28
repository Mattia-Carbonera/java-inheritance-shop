package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Prodotto prodottoUno = new Prodotto("nomeUno", "marcaUno", new BigDecimal(224.3));
        System.out.println(prodottoUno.getPrezzo());

        System.out.println("--------------------------------------------------");
        System.out.println("smartphoneUno");
        Smarphone smartphoneUno = new Smarphone("iPhone", "Apple", new BigDecimal(1449), "aff36a7d7f27d8", 256);
        System.out.println(smartphoneUno.getImei());
        System.out.println(smartphoneUno.getNome());
        System.out.println(smartphoneUno.getPrezzo());

        System.out.println("--------------------------------------------------");
        System.out.println("televisoreUno");
        Televisori televisoreUno = new Televisori("NomeTelevisoreUno", "Samsung", new BigDecimal(1299.99), 0, true);
        System.out.println(televisoreUno.getIsSmartTv());
        System.out.println(televisoreUno.getNome());
        System.out.println(televisoreUno.getPrezzo());

        System.out.println("--------------------------------------------------");
        System.out.println("CuffuaUno");
        Cuffie cuffiaUno = new Cuffie("nomeCuffiaUno", "Bitz", new BigDecimal(69.99), "black", false);
        System.out.println(cuffiaUno.getIsWireless());
        System.out.println(cuffiaUno.getNome());
        System.out.println(cuffiaUno.getPrezzo());

    }
}
