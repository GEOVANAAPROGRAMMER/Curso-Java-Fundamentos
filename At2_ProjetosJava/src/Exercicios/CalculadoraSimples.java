package Exercicios;

import java.util.Scanner;

public class CalculadoraSimples {
	
	public static void main(String[] args) {
		
		float numUm = 0;
		float numDois = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número : ");
		numUm = sc.nextFloat();
		System.out.println("Digite o segundo número : ");
		numDois = sc.nextFloat();
		
		System.out.println("Digite o sinal da operação que deseja fazer : ");
		char operacao = sc.next().charAt(0);
		
		if (operacao == '+') {
			System.out.println(numUm + numDois);
		} else if (operacao == '-') {
			System.out.println(numUm - numDois);
		} else if (operacao == '*') {
			System.out.println(numUm * numDois);
		} else if (operacao == '/') {
			System.out.println(numUm / numDois);
			
		} else {
			System.out.println("Símbolo inválido! Digite um desses símbolos: +, -, *, /");
		}
		
		sc.close();
	}

}
