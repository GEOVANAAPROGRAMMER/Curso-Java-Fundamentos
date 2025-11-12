package exerciciosRepeticao;

import java.util.Scanner;

public class RepeticaoWhile {
	
	public static void main(String[] args) {
		
		System.out.println("Digite o codigo do produto: \nPara sair digite 0.");
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();
		
		int i = 0;
		
		while (codigo != 0 ) {
			i++;
			System.out.println("Item " + codigo + " registrado!");
			System.out.println("Digite o codigo do produto: \nPara sair digite 0.");
			codigo = sc.nextInt();
		}
		System.out.println("\nTotal de produtos registrados: " + i);
		System.out.println("Programa encerrado!");
		
		sc.close();
	}

}
