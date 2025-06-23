package br.com.Strings;

public class Strings {
	
	public static void main(String[] args) {
		
		
		
		// Formas de como declarar Strings
		
		String nome;
		nome = new String();
		nome = "Maça";
		System.out.println(nome);
		
		
		String nome2 = new String ("Banana");
		System.out.println(nome2);
		
		String nome3 = "Goiaba";
		System.out.println(nome3);
		
		
		// Caracter de escape:
		System.out.println("Nova linha \nPosiciona o cursor no início da próxima linha.");
		System.out.println("Tabulação horizontal \tMove o cursor para a próxima posição da tabulação horizontal.");
		System.out.println("Aspas duplas: \"Utilizada para gerar um caractere de aspas duplas.\"");
		
		
		// Concatenando:
		String fruta = "Maçã ";
		String descricao = "tipo gala, a melhor do mercado!";
		String slogan = fruta + descricao;
		System.out.println(slogan);
		
		String slogan1 = fruta + " " + descricao;
		System.out.println(slogan1);
		
		fruta += "tipo gala.";
		
	}

}
