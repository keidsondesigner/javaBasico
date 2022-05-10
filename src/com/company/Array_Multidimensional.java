package com.company;

import java.util.Random;

public class Array_Multidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] Matriz = new int[4][4];

        for(int linha = 0; linha < Matriz.length; linha++){
            for(int coluna = 0; coluna < Matriz[linha].length; coluna++){
                Matriz[linha][coluna] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for ( int[] elementoDaLinha : Matriz ) {
            for ( int elementoDaColuna : elementoDaLinha) {
                System.out.print(elementoDaColuna + " ");
            }
            System.out.println();

        }
    }
}
