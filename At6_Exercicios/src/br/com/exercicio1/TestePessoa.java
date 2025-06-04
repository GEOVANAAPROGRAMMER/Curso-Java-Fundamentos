/* 1. Criar uma classe Pessoa
Atributos: nome, idade, altura
Métodos: falar(), andar()
Crie uma instância e teste no main. */

package br.com.exercicio1;

public class TestePessoa {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Geovana");
		pessoa.setIdade(21);
		pessoa.setAltura(1.64);
		
		
		pessoa.falar("Estou falando!");
		pessoa.andar("Estou andando!");
		
	}

}
