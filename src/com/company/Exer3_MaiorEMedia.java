package com.company;

import java.util.Scanner;

/*
Faça um programa que execute 5 vezes,e leia um número por vezes.
Informe o maior número e a média desses números.
*/

public class Exer3_MaiorEMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        //int count = 0;
        /*
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if(numero > maior) maior = numero;

            count = count + 1;
            System.out.println("O maior número inserido é: " + maior);
        } while ( count < 5);

        */

        for (int count = 0; count < 5; count++){
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if(numero > maior) maior = numero;
            //System.out.println("O maior número inserido é: " + maior);

        }
        System.out.println("O maior número inserido é: " + maior);
        System.out.println("Média: " + (soma / 5));

    }
}
