package exercicios;
import java.util.Scanner;

public class OlaMundo {
	
	public static void main(String[] args) {
		System.out.println("Olá mundo! Estou voltando para o Java!");
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite seu nome: ");
	String nome = sc.next();
	
	
	if (nome.equalsIgnoreCase("Geovana")) {
		System.out.println("Gege é linda!");
	}else {
		System.out.println("Você é feio!");
	}
		
	sc.close();
	}

}
