package Exercicios;

import java.util.Scanner;

public class ClassificaçãoDeNotas {
	
	public static void main(String[] args) {
		
		float nota = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite sua nota: ");
		nota = sc.nextFloat();
		
		if (nota >= 7) {
			System.out.println("Você está aprovado!");
		} else if (nota >= 5 && nota < 7) {
			System.out.println("Você está de recuperação!");
		} else {
				System.out.println("Você está reprovado!");
		}
		
		sc.close();
	}

}
