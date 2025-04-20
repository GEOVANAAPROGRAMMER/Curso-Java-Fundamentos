package Exercicios;

import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {

		int idade = 45;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.println("Olá, " + nome + "!");
		
		if (idade >= 18 && idade < 70 ) {
			System.out.println("Você é maior de idade");
		} else if (idade >= 70 ) {
			System.out.println("Você está na terceira idade");
		} else if (idade < 0 ) {
			System.out.println("Idade inválida");
		} else {
			System.out.println("Você é menor de idade");
		}
		
		sc.close();

	}

}
