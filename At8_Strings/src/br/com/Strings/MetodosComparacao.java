package br.com.Strings;

public class MetodosComparacao {

	public static void main(String[] args) {

		String nome = new String("maça");
		String nome2 = new String("Maça");
		String nome3 = new String("maça");
		
		// Comparando Strings, mesma palavra, porém escrita com a inicial maiúscula
		System.out.println(nome.equals(nome2));  // false
		
		// Comparando Strings, mesma palavra, porém ignorando se as letras são maiúsculas ou minusculas
		System.out.println(nome.equalsIgnoreCase(nome2));  //true
		
		// Comparando Strings, mesma palavra, comparando apenas o conteudo dos variaveis
		System.out.println(nome.equals(nome3));  // true
		
		
		/** Dessa forma não estamos comparando o conteudo das vairaveis, 
		 * estamos comparando se elas estão alocadas no mesmo local da memória, pois instaciamos essas variaveis
		 */
		boolean teste = (nome == nome3);
		System.out.println(teste);       // false
		
		String nome4 = "maça";
		String nome5 = "maça";
		
		// Comparando apenas o conteudo das variaveis
		teste = (nome4 == nome5);
		System.out.println(teste);   // true
	}

}
