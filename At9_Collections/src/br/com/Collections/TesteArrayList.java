package br.com.Collections;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {

	public static void main(String[] args) {

		// Interface List e uso de Generics
		// Generics não permite tipos primitivos
		List<String> carrinho = new ArrayList<String>();

		// Verifica se o array está vazio
		System.out.println(carrinho.isEmpty());

		carrinho.add("Manga");
		carrinho.add("Maça");
		carrinho.add("Melancia");
		carrinho.add("Maça");
		// Set edita o valor da variável dentro do array
		carrinho.set(2, "Pera");

		System.out.println(carrinho);
		System.out.println(carrinho.isEmpty());

		// Verifica o tamanho do array
		System.out.println(carrinho.size());

		// Verifica se a palavra Maça está contida em algum dos intens do arraylist
		System.out.println(carrinho.contains("Maça"));

		// Retorna em qual posição a palavra Maça está
		System.out.println(carrinho.indexOf("Maça"));

		// Retorna a palavra Maça a partir da posição encontrada pelo método IndexOf
		System.out.println(carrinho.get(carrinho.indexOf("Maça")));

		// Retorna a última ocorrência da palavra Maça
		System.out.println(carrinho.lastIndexOf("Maça"));

		// Remove o item Maça a partir da posição encontrada
		carrinho.remove(carrinho.indexOf("Maça"));
		System.out.println(carrinho);

		// Apaga todos os itens do array
		carrinho.clear();
		System.out.println(carrinho.isEmpty());

	}

}
