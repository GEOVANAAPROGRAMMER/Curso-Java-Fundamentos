package exercicios.abstrata;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do gerente: ");
		String nomeg = sc.next();
		
		System.out.println("Digite o salário do gerente: ");
		double salariog = sc.nextDouble();
		
		Funcionario gerente = new Gerente(nomeg, salariog);
		System.out.println(gerente.getSalario());
		
		sc.close();

	}

}
