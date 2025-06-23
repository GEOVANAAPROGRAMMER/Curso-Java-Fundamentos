package br.com.Strings;

public class SubLowerUpper {
	
	public static void main(String[] args) {
		
		String descricao = new String ("Maça Gala, a maça mais doce do mercado!");
		
		// Transforma todas as letras da String em minuscula
		System.out.println(descricao.toLowerCase());
		
		// Transforma todas as letras da String em maiuscula
		System.out.println(descricao.toUpperCase());
		
		// Mostra índice do 0 até o caracter 4
		System.out.println(descricao.substring(0, 4));
		
		// Mostra índice do 4 até o final da String
		System.out.println(descricao.substring(4));
		
		// Imprime uma parte da string "descricao", começando na palavra "Maça" e indo até o primeiro espaço encontrado após ela
		System.out.println(descricao.substring(
				descricao.indexOf("Maça"),
				descricao.indexOf(" ")));
		
		System.out.println('\n');
		
		System.out.println(descricao);
	}

}
