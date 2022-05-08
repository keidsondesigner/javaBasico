package com.company;

public class Main {

	public static void main(String[] args) {

		//Calculadora
		System.out.println("Exercício calculadora");

		Calculadora.soma(3, 6);
		Calculadora.subtracao(9, 1.8);
		Calculadora.multiplicacao(7, 8);
		Calculadora.divisao(5, 2.5);

		//Mensagem
		System.out.println("Exercício mensagem");

		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(1);

		//Emprestimo
		System.out.println("Exercício emprestimo");

		Emprestimo.calcular(1000, 2);
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());

		//Quadrilátero
		System.out.println("Exercício quadrilátero");

		Quadrilatero.area(3);
		Quadrilatero.area(5, 5);
		Quadrilatero.area(7, 8, 9);

		//Quadrilátero2 <- com retorno
		System.out.println("Exercício quadrilátero2 com retorno");

		double areaQuadrado = Quadrilatero2.area(3);
		System.out.println("Área do quadrado: " + areaQuadrado);

		double areaRetangulo = Quadrilatero2.area(5, 5);
		System.out.println("Área do retangulo: " + areaRetangulo);

		double areaTrapezio = Quadrilatero2.area(7, 8, 9);
		System.out.println("Área do trapezio: " + areaTrapezio);

		//Condicional e Controle de Fluxos

		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = true;

		System.out.println("b1 && b2: " + (b1 && b2));
		System.out.println("b1 && b3: " + (b1 && b3));

		System.out.println("b2 || b3: " + (b2 || b3));
		System.out.println("b2 || b4: " + (b2 || b4));

		System.out.println("b1 ^ b3: " + (b1 ^ b3));
		System.out.println("b4 ^ b1: " + (b4 ^ b1));

		System.out.println(!b1);
		System.out.println(!b2);

		int i1 = 10;
		int i2 = 5;
		float f1 = 20f;
		float f2 = 50f;
		System.out.println(" (i1 + i2) < (f2 - f1) && true: " + (((i1 + i2) < (f2 - f1)) && true));
		System.out.println(" (i1 > i2) || (f2 < f1): " + ((i1 > i2) || (f2 < f1)));

		double salarioMensal = 11893.58d;
		double mediaSalarial = 10500d;

		int quantidaDependentes = 4;
		int mediaDependentes = 2;

		boolean salarioBaixo = salarioMensal < mediaSalarial;
		boolean muitosDependentes = quantidaDependentes >= mediaDependentes;

		boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		System.out.println("Recebe Auxilio: " + recebeAuxilio);
	}
}
