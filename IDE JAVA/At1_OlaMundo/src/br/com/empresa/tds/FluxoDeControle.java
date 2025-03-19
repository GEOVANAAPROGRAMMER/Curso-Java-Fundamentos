package br.com.empresa.tds;

public class FluxoDeControle {

	public static void main(String[] args) {

		int idade = 84;

		if (idade >= 18 && idade < 70 ) {
			System.out.println("Essa pessoa é maior de idade.");
		} else if ( idade >= 70 ){
			System.out.println("Essa pessoa está na terceira idade.");
		} else {
			System.out.println("Essa pessoa é menor de idade.");
		}

	}

}
