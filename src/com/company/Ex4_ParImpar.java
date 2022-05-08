package com.company;



import java.util.Scanner;

/*
Faça um programa que peça N números interios,
calcule e mostre a quantidade de númeors pares
e a quantiadade de números impares.
* */

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int quantNumeros;
        int quantPares = 0;
        int quantImapres = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        for ( int count = 0; count < quantNumeros; count++){
            System.out.println("Número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) quantPares++;
            else quantImapres++;

        }
        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impar: " + quantImapres);

    }
}
