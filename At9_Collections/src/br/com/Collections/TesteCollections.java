package br.com.Collections;

import java.util.ArrayList;

public class TesteCollections {
	
	public static void main(String[] args) {
		
		ArrayList carrinho = new ArrayList();
		
		Double valor = 100.55;
		int valor2 = 1;
		int valor3;
		
		carrinho.add(valor);
		carrinho.add("Uva");
		carrinho.add(valor2);

		System.out.println(carrinho.get(1));
		System.out.println(carrinho);
	
	}
	
}
