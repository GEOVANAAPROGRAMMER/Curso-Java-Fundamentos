// Javabeans e Encapsulamento

package br.com.exercicio06;

import java.io.Serializable;

//Serializando classe, transformando informaçoes em bits
public class Pessoa implements Serializable {
	
	/**
	 * Definindo qua é a versão do objeto
	 */
	private static final long serialVersionUID = 1L;
	
	
	// Declarando atributos privados
	private String nome;
	
	// Construtor padrão
	public Pessoa() {
		
	}
	
	// Criando métodos para acessar e alterar atributos
	public String getNome () {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}

}
