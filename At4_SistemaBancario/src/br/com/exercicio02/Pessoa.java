package br.com.exercicio02;

public class Pessoa {

	public static void main(String[] args) {
		
		VerificadorDeNegativos cc = new VerificadorDeNegativos(7374, 28998, -10.0);
		
		System.out.println("Valor inicial: R$" + cc.verificarSaldo());

	}

}
