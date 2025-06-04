/* 5. Conversão de tipos
Peça para o usuário digitar seu peso (como String) e sua altura (como String).
Converta os valores para double e calcule o IMC (Índice de Massa Corporal). */

package br.com.exercicio5;

import java.util.Scanner;

public class ConversaoTipos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu peso: \n");
		String peso = sc.nextLine();
		
		System.out.println("Digite sua altura: \n");
		String altura = sc.nextLine();
		
		double alturaConvertida = Double.parseDouble(altura);	
		double pesoConvertido = Double.parseDouble(peso);
		
		double IMC = pesoConvertido / (alturaConvertida * alturaConvertida);
		
		if (IMC < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (IMC > 18.5 && IMC < 24.9) {
			System.out.println("Peso normal");
		} else if (IMC > 25.0 && IMC < 29.9) {
			System.out.println("Sobrepeso");
		} else {
			System.out.println("Obesidade");
		}		
		
		sc.close();

	}

}
