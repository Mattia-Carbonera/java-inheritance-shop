package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.println("Quanti prodotti desidera acquistare?");
        int productQuantity = inputUser.nextInt();

        Prodotto[] productCart = new Prodotto[productQuantity];

        // ? debug
        System.out.println("numeri prodotti scelto: " + productQuantity);

        for(int i = 0; i < productQuantity; i++) {
            System.out.println("Prodotto numero " + (i +1));
            System.out.println("Indice dell'array corrente: " + (i));
            
            System.out.println("Scegliere la tipologia di prodotto e digitare il numero correlato: 1 - Smartphone, 2 - Televisori, 3 - Cuffie.");
            int productNumber = inputUser.nextInt();

            if(productNumber != 1 && productNumber != 2 && productNumber != 3 && productQuantity < 0) {
                break;
            }

            
            System.out.println("Inserire il nome del prodotto.");
            String fix = inputUser.nextLine();
            String productName = inputUser.nextLine();


            System.out.println("Inserire la marca del prodotto.");
            String productBrans = inputUser.nextLine();

            System.out.println("Inserire il prezzo del prodotto.");
            String productPrice = inputUser.nextLine();


            
            if( productNumber == 1) {
                System.out.println("Inserire il codice IMEI dello smartphone.");
                String productImei = inputUser.nextLine();
                System.out.println("Inserire la capacità di memoria dello smartphone.");
                String productStorage = inputUser.nextLine();
                
            }
            
            if(productNumber == 2) {
                System.out.println("Inserire i pollici del televisore.");
                String productHeigt = inputUser.nextLine();
                System.out.println("Il televisore è smart? 1 - Si, 2 - No");
                int productIsSmart = inputUser.nextInt();
            }
            
            if(productNumber == 3) {
                System.out.println("Inserire il colore delle cuffie");
                String productColor = inputUser.nextLine();
                System.out.println("Le cuffie sono wireless? 1 - Si, 2 - No");
                int productIsWireless = inputUser.nextInt();
            }
            
            // creo l'istanza e la aggiungo all'array
            if( productNumber == 1) {
                Smarphone smartphone = new Smarphone(productName, productBrans, new BigDecimal(productPrice), "ggw4ge34", 256);
                productCart[i] = smartphone;
            }
            
            if(productNumber == 2) {
                Televisori televisore = new Televisori(productName, productBrans, new BigDecimal(1999), 55, false);
                productCart[i] = televisore;
            }
            
            if(productNumber == 3) {
                Cuffie cuffia = new Cuffie(productName, productBrans, new BigDecimal(productPrice),"nero",  false);
                productCart[i] = cuffia;
            }
        }

        // chiudo lo scanner
        inputUser.close();
        
        // output
        System.out.println("Quantità di articoli nel carrello " + productCart.length);

        for(int i = 0; i < productCart.length; i++) {
            System.out.println("Articolo " + (i + 1) + ": " + productCart[i].toString());
        }



    }

}
