package exercicios;

import java.util.Scanner;

public class TesteIMC {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso (kg): ");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura (m): ");
        double altura = sc.nextDouble();

        // Cria o objeto IMC usando o construtor personalizado
        IMC pessoa = new IMC(peso, altura);

        // Calcula o IMC
        double resultado = pessoa.calcImc();

        System.out.printf("Seu IMC é: %.2f%n", resultado);

        // Interpretação simples
        if (resultado < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (resultado < 25) {
            System.out.println("Peso normal.");
        } else if (resultado < 30) {
            System.out.println("Sobrepeso.");
        } else {
            System.out.println("Obesidade.");
        }

        sc.close();
    }
}

