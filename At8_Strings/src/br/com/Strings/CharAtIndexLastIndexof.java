package br.com.Strings;

public class CharAtIndexLastIndexof {

	public static void main(String[] args) {

		String descricao = new String ("Maça Gala, a maça mais doce do mercado!");
		
		//Retorna o caracter na posição 1
		System.out.println(descricao.charAt(1));    // "a"
		
		//Retorna o indice da posição do caracter "G"
		System.out.println(descricao.indexOf("G"));
		
		//Retorna o indice da última ocorrência do caracter "a"
		System.out.println(descricao.lastIndexOf("a"));

	}

}
