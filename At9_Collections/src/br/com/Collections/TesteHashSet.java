package br.com.Collections;

import java.util.HashSet;
import java.util.Set;

public class TesteHashSet {
	
	public static void main(String[] args) {
		
		Set<String> cesta = new HashSet<String>();
		
		System.out.println(cesta.isEmpty());
		
		cesta.add("Maça");
		cesta.add("maça");
		cesta.add("Maça");
		
		System.out.println(cesta.isEmpty());
		
		System.out.println(cesta.size());
		
		// Aqui vemos que o HashSet não aceita itens duplicados
		System.out.println(cesta);
	}

}
