package br.com.Collections;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {
	
	public static void main(String[] args) {
		
		// Map é útil para recuperar itens a partir de uma chave 
		
		Map<String, String> caixa = new HashMap<String, String>();
		caixa.put("M2223", "Soraya");
		caixa.put("M2224", "Spike");
		caixa.put("M2225", "James");
		
		System.out.println(caixa.isEmpty()); 
		System.out.println(caixa.size());
		
		// Verifica se a chave existe
		System.out.println(caixa.containsKey("M2224"));
		
		// Verifica se o item Spike existe
		System.out.println(caixa.containsValue("Spike"));
		
		System.out.println(caixa);
		
	}

}
