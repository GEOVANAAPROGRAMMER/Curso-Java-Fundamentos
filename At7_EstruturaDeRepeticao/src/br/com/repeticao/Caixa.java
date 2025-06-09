package br.com.repeticao;

public class Caixa {

	public static void main(String[] args) {

		int qtdProdutos = 5;
		int registro = 0;
		
		while (registro < qtdProdutos) {
			registro++;
			System.out.println("O produto número " + registro + " foi registrado utilizando  WHILE");
		}
	
		System.out.println("\n");
		
		// Zerando variávael para realizar mais testes
		registro = 0;
		
		do {
			registro++;
			System.out.println("O produto número " + registro + " foi registrado utilizando DO WHILE");
		} while (registro < qtdProdutos);
		
		System.out.println("\n");
		
		// Zerando variávael para realizar mais testes
		qtdProdutos = 5;
		
		for (int i=1; i <= qtdProdutos; i++) {
			System.out.println("O caixa registrou o produto " + i + " utilizando FOR");
		}

	}

}
