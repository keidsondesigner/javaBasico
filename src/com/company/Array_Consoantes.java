package com.company;

import java.util.Scanner;

public class Array_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        for(int count = 0; count < consoantes.length; count++ ){
            System.out.println("Letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))

            ) {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }
        }

        //foreach recebe tipo do elemento, e depois recebe o array
        System.out.print("Consoantes: \n");
        for (String consoant : consoantes) {
            if (consoant != null)
                System.out.println(consoant + " ");
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
    }
}
