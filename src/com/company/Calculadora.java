package com.company;

public class Calculadora {

	public static void soma(double x, double y){
		double result = x + y;
		System.out.println("A soma de " + x + " mais " + y + " = " + result);
	}


	public static void subtracao(double x, double y){
		double result = x - y;
		System.out.println("A subtração de " + x + " menos " + y + " = " + result);
	}


	public static void multiplicacao(double x, double y){
		double result = x * y;
		System.out.println("A multiplicação de " + x + " vezes " + y + " = " + result);
	}


	public static void divisao(double x, double y){
		double result = x / y;
		System.out.println("A divisão de " + x + " por " + y + " = " + result);
	}
}