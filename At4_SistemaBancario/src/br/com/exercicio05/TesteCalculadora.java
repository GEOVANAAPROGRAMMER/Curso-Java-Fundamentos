package br.com.exercicio05;

public class TesteCalculadora {
	
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		System.out.println("Resultado da operação de soma: " + calc.somar(100, 20));
		System.out.println("Resultado da operação de subtração: " + calc.subtrair(100, 20));
		System.out.println("Resultado da operação de multiplicação: " + calc.multiplicar(100, 20));
		System.out.println("Resultado da operação de divisão: " + calc.dividir(100, 20));
		
	}

}
