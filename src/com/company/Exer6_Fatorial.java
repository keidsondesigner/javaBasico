package com.company;

import java.util.Scanner;

/*
Faça um programa que calculeofatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5X4X3X2X1)
*/

public class Exer6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.println(fatorial +"! = ");
        for (int i = fatorial; i >= 1; i--){
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }
}
