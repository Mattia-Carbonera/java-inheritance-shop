package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        // gestione carta fedeltà
        System.out.println("Possiede la carta fedeltà? 1 - Si, 2 - No");
        int fedelityCard = inputUser.nextInt();
        if(fedelityCard < 0 || fedelityCard > 2) {
            return;
        }

        // gestione input
        System.out.println("Quanti prodotti desidera acquistare?");
        int productQuantity = inputUser.nextInt();

        Prodotto[] productCart = new Prodotto[productQuantity];

        // ? debug
        // System.out.println("numeri prodotti scelto: " + productQuantity);

        for(int i = 0; i < productQuantity; i++) {
            System.out.println("Prodotto numero " + (i +1));
            
            System.out.println("Scegliere la tipologia di prodotto e digitare il numero correlato: 1 - Smartphone, 2 - Televisori, 3 - Cuffie.");
            int productNumber = inputUser.nextInt();

            if(productNumber != 1 && productNumber != 2 && productNumber != 3 && productQuantity < 0) {
                break;
            }

            
            System.out.println("Inserire il nome del prodotto.");
            String fixer = inputUser.nextLine();
            String productName = inputUser.nextLine();


            System.out.println("Inserire la marca del prodotto.");
            String productBrans = inputUser.nextLine();

            System.out.println("Inserire il prezzo del prodotto.");
            int productPrice = inputUser.nextInt();


            
            // chiedo i dati in base alla tipologia di prodotto

            // Smaptphone
            if( productNumber == 1) {
                System.out.println("Inserire il codice IMEI dello smartphone.");
                String fixer2 = inputUser.nextLine();
                String productImei = inputUser.nextLine();
                System.out.println("Inserire la capacità di memoria dello smartphone.");
                int productStorage = inputUser.nextInt();

                if(fedelityCard == 1 && productStorage > 32) {
                    BigDecimal discountedPrice = new BigDecimal(productPrice);
                    BigDecimal discount = new BigDecimal(productPrice / 100 * 5);
                    BigDecimal newPricew = discountedPrice.subtract(discount);
                    // creo l'istanza e la aggiungo all'array
                    Smarphone smartphone = new Smarphone(productName, productBrans, newPricew, productImei, productStorage);
                    productCart[i] = smartphone;
                } else if(fedelityCard == 1) {
                    BigDecimal discountedPrice = new BigDecimal(productPrice);
                    BigDecimal discount = new BigDecimal(productPrice / 100 * 2);
                    BigDecimal newPricew = discountedPrice.subtract(discount);
                    // creo l'istanza e la aggiungo all'array
                    Smarphone smartphone = new Smarphone(productName, productBrans, newPricew, productImei, productStorage);
                    productCart[i] = smartphone;
                } else {
                    Smarphone smartphone = new Smarphone(productName, productBrans, new BigDecimal(productPrice), productImei, productStorage);
                    productCart[i] = smartphone;
                }
                
            }
            
            // TV
            if(productNumber == 2) {
                System.out.println("Inserire i pollici del televisore.");
                int productHeigt = inputUser.nextInt();
                System.out.println("Il televisore è smart? 1 - Si, 2 - No");
                int productIsSmart = inputUser.nextInt();

                if(fedelityCard == 1 && productIsSmart == 2) {
                    BigDecimal discountedPrice = new BigDecimal(productPrice);
                    BigDecimal discount = new BigDecimal(productPrice / 100 * 10);
                    BigDecimal newPricew = discountedPrice.subtract(discount);
                    // creo l'istanza e la aggiungo all'array
                    Televisori televisore = new Televisori(productName, productBrans, newPricew, productHeigt, (productIsSmart == 1 ? true : false));
                    productCart[i] = televisore;
                } else if(fedelityCard == 1) {
                    BigDecimal discountedPrice = new BigDecimal(productPrice);
                    BigDecimal discount = new BigDecimal(productPrice / 100 * 2);
                    BigDecimal newPricew = discountedPrice.subtract(discount);
                    // creo l'istanza e la aggiungo all'array
                    Televisori televisore = new Televisori(productName, productBrans, newPricew, productHeigt, (productIsSmart == 1 ? true : false));
                    productCart[i] = televisore;
                } else {
                    Televisori televisore = new Televisori(productName, productBrans, new BigDecimal(productPrice), productHeigt, (productIsSmart == 1 ? true : false));
                    productCart[i] = televisore;
                }
            }
            
            // Cuffie
            if(productNumber == 3) {
                System.out.println("Inserire il colore delle cuffie");
                String productColor = inputUser.nextLine();
                System.out.println("Le cuffie sono wireless? 1 - Si, 2 - No");
                int productIsWireless = inputUser.nextInt();

                if(fedelityCard == 1 && productIsWireless == 2) {
                    BigDecimal discountedPrice = new BigDecimal(productPrice);
                    BigDecimal discount = new BigDecimal(productPrice / 100 * 7);
                    BigDecimal newPricew = discountedPrice.subtract(discount);
                    // creo l'istanza e la aggiungo all'array
                    Cuffie cuffia = new Cuffie(productName, productBrans, newPricew, productColor,  (productIsWireless == 1 ? true : false));
                    productCart[i] = cuffia;
                } else if(fedelityCard == 1) {
                    BigDecimal discountedPrice = new BigDecimal(productPrice);
                    BigDecimal discount = new BigDecimal(productPrice / 100 * 2);
                    BigDecimal newPricew = discountedPrice.subtract(discount);
                    // creo l'istanza e la aggiungo all'array
                    Cuffie cuffia = new Cuffie(productName, productBrans, newPricew, productColor,  (productIsWireless == 1 ? true : false));
                    productCart[i] = cuffia;
                } else {
                    Cuffie cuffia = new Cuffie(productName, productBrans, new BigDecimal(productPrice),"nero",  (productIsWireless == 1 ? true : false));
                    productCart[i] = cuffia;
                }
            }

        }

        // gestione carta fedeltà
        BigDecimal totalPrice = new BigDecimal(0.00);
        for(int i = 0; i < productCart.length; i++) {
            totalPrice = totalPrice.add(productCart[i].getPrezzo());
            System.out.println(productCart[i].getPrezzo());
        }

        // chiudo lo scanner
        inputUser.close();
        
        // output
        System.out.println("------------------------------------------------------");
        System.out.println("Quantità di articoli nel carrello " + productCart.length);

        for(int i = 0; i < productCart.length; i++) {
            System.out.println("Articolo " + (i + 1) + ": " + productCart[i].toString());
        }

        System.out.println("Totale ordine: " + totalPrice+ "€");



    }

}
