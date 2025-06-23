package br.com.Strings;

public class LengthStartsEnds {
	
	public static void main(String[] args) {
		
		String descricao = new String ("Maça Gala, a maça mais doce do mercado!");
		
		// Quantidade / tamanho de caracteres na variável descrição
		System.out.println(descricao.length());
		
		// Verifica se a String inicia com a palavra "Maça"
		System.out.println(descricao.startsWith("Maça"));
		
		// Verifica se a String finaliza com "!"
		System.out.println(descricao.endsWith("!"));
		
		
		
	}

}
