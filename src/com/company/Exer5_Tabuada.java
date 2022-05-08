package com.company;

import java.util.Scanner;
/*
Desenvolva um gerador de tabuada,
capaz de geraratabuada de qualquer número inteiro entre1a10.
Ousuário deve informar de qual numero ele deseja veratabuada.
Asaída deve ser conformeoexemplo abaixo:
Tabuada de 5:
5X1=5
5X2=10
5X10=50
*/

public class Exer5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual tabuada você deseja consultar? ");
        int tabuada = scan.nextInt();

        System.out.println("Resultado da tabuada de " + tabuada );

        for (int i = 1; i <= 10; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
    }
}
