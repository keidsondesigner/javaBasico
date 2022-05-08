package com.company;

public class Array_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};
        System.out.println("O tamanho do vetor é: \n" + vetor.length);

        System.out.print("Vetor Ordenado: \n");
        for(int count = 0; count < vetor.length; count++){
            System.out.println(vetor[count] + " ");
        }
        //Ordem inversa
        System.out.print("Vetor Inverso: \n");
        for(int i = (vetor.length -1); i >= 0; i--){
            System.out.println(vetor[i] + " ");
        }
    }
}
