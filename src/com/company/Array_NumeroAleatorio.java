package com.company;

import java.util.Random;
import java.util.Scanner;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os númeroseseus sucessores.
*/

public class Array_NumeroAleatorio {
    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);

        int[] numeroAleatorios = new int[20];

        Random random = new Random();

        for(int i = 0; i < numeroAleatorios.length; i++){
            int numero = random.nextInt(100);
            numeroAleatorios[i] = numero;
        }

        System.out.print("\n Números Aleatórios: ");
        for ( int numero : numeroAleatorios) {
            System.out.print((numero)  + " ");
        }

        System.out.print("\n Antecessores dos Números Aleatórios: ");
        for ( int numero : numeroAleatorios) {
            System.out.print((numero - 1)  + " ");
        }

        System.out.print("\n Sucessores dos Números Aleatórios: ");
        for ( int numero : numeroAleatorios) {
            System.out.print((numero + 1)  + " ");
        }
    }
}
