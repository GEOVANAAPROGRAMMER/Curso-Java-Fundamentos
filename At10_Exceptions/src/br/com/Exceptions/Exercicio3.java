package br.com.Exceptions;

public class Exercicio3 {


	    public static void verificarIdade(int idade) throws Exception {
	        if (idade < 18) {
	            throw new Exception("Acesso negado. Menor de idade.");
	        } else {
	            System.out.println("Acesso permitido!");
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            verificarIdade(16); // Teste com valor menor que 18
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
	

}
