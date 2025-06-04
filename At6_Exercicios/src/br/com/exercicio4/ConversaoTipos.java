/* 4. Conversão de tipos
Peça para o usuário digitar uma String com número.
Converta para int e double.
Exiba o dobro e o triplo do valor. */

package br.com.exercicio4;

import java.util.Scanner;

public class ConversaoTipos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		String numeroTexto = scanner.nextLine();
		
		int numeroInt = Integer.parseInt(numeroTexto);
		double numeroDouble = Double.parseDouble(numeroTexto);
		
		System.out.println("Dobro  (int)   : " + (numeroInt * 2));
		System.out.println("Triplo (int)   : " + (numeroInt * 3));
		
		System.out.println("Dobro  (double): " + (numeroDouble * 2));
		System.out.println("Triplo (double): " + (numeroDouble * 3));
		
		scanner.close();

	}

}
