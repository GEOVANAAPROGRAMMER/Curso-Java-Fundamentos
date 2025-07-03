package br.com.Exceptions;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {


		//Exceções Checked
		try {
			int var = 10/0;
			
			
		} catch (ArithmeticException e) {
			System.out.println("Não é possível realizar divisões por zero!");
			
			//Imprime os erros da exceção
			e.printStackTrace();
		} 
		
		try {
			int[] valores = new int[3];
			System.out.println(valores[4]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição do array inválida!");
			
			//Imprime os erros da exceção
			e.printStackTrace();
		}

		try {
			String nome = null;
			System.out.println(nome.length());
		}catch(NullPointerException e) {
			System.out.println("Variável nome não instanciada! Não é possível verificar o tamanho!");
			
			e.printStackTrace();
		}
		
		try {
			int numero = Integer.parseInt("zero");
		}catch (NumberFormatException e) {
			System.out.println("Conversão inválida!");
			e.printStackTrace();
		}
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		String entrada = sc.nextLine();
		
		try {
			int conversao= Integer.parseInt(entrada);     // tentativa de conversão
			System.out.println("Este é o número: " + entrada);
		}catch (NumberFormatException e) {
			System.out.println("Conversão inválida!");
		} finally {
			System.out.println("**** As exceções sempre passarão pelo FINALLY. ****");
		}
		
		sc.close();
	}

}
