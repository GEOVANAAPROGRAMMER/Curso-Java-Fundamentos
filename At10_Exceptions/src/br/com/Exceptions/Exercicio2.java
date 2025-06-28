// Exercício 2 – Unchecked Exception (Opcional)
package br.com.Exceptions;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		String entradaUm = sc.nextLine();
		
		System.out.println("Digite o segundo número: ");
		String entradaDois = sc.nextLine();
		
		try {
			double numUm = Integer.parseInt(entradaUm);
			double numDois = Integer.parseInt(entradaDois);
			
			double result = numUm / numDois;
			System.out.println(result);
		}catch(NumberFormatException e) {
			System.out.println("Divisão por zero é inválida!");
		}
		
		sc.close();
	}
	
}
