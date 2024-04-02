package org.experis.learning;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        // Inizializzo lo Scanner
        Scanner scan = new Scanner(System.in);

        // Chiedo all'utente quanti prodotti sta inserendo
        System.out.print("Quanti prodotti stai inserendo? ");
        int dimensioneArr = Integer.parseInt(scan.nextLine());

        // Inizializzo l'array del carrello
        Prodotto[] carrello = new Prodotto[dimensioneArr];

        //** Ciclo le posizioni nulle e ad ognuna sovrascrivo un'istanza della classe Prodotto risultante dal costruttore
        // al quale vengono passati gli input dell'utente **//
        for (int i = 0; i < carrello.length; i++) {
            // Chiedo all'utente le informazioni comuni a tutti i tipi di prodotto
            System.out.println("Prodotto n°" + (i + 1));
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            System.out.print("Marca: ");
            String marca = scan.nextLine();
            System.out.print("Prezzo: ");
            String strPrezzo = scan.nextLine().replaceAll(",", ".");
            System.out.print("IVA: ");
            String strIVA = scan.nextLine().replaceAll(",", ".");

            System.out.print("Inserisci il tipo di prodotto (Smartphone, Televisore, Cuffie): ");
            String tipoProdotto = scan.nextLine();

            switch (tipoProdotto.toLowerCase()) {
                case "smartphone":
                    // Chiedo la quantità di memoria dello smartphone
                    System.out.print("Quanti GB di memoria ha? ");
                    int memoria = scan.nextInt();
                    // Utilizzo il costruttore dello smartphone
                    Prodotto sm = new Smartphone(nome, marca, new BigDecimal(strPrezzo), new BigDecimal(strIVA), memoria);
                    carrello[i] = sm;
                    break;
                case "televisore":
                    // Chiedo le dimensioni in pollici dello schermo e se è smart
                    System.out.print("Inserire le dimensioni dello schermo in pollici (solo il numero): ");
                    int dimensioneSchermo = scan.nextInt();
                    scan.nextLine();
                    System.out.print("È una smart TV? (S/N): ");
                    String èSmart = scan.nextLine().toLowerCase();
                    boolean isSmart = èSmart.equals("s");
                    // Utilizzo il costruttore del televisore
                    Prodotto tv = new Televisore(nome, marca, new BigDecimal(strPrezzo), new BigDecimal(strIVA), dimensioneSchermo, isSmart);
                    carrello[i] = tv;
                    break;
                case "cuffie":
                    // Chiedo il colore e se sono wireless
                    System.out.print("Inserire il colore: ");
                    String colore = scan.nextLine();
                    System.out.print("Sono Wireless? (S/N)");
                    String èWireless = scan.nextLine().toLowerCase();
                    boolean isWireless = èWireless.equals("s");
                    // Utilizzo il costruttore delle cuffie
                    Prodotto cuffia = new Cuffia(nome, marca, new BigDecimal(strPrezzo), new BigDecimal(strIVA), colore, isWireless);
                    carrello[i] = cuffia;
                    break;
                default:
                    System.out.println("Tipo di prodotto non valido.");
                    break;
            }
            scan.nextLine();
        }

        for(Prodotto p : carrello){
            System.out.println(p.getInfoProdotto());
        }

        scan.nextLine();

        // Chiudo lo Scanner
        scan.close();
    }
}
