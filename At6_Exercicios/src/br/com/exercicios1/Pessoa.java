package br.com.exercicios1;

import java.io.Serializable;

public class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Pessoa() {
		
	}
	
	private String nome;
	private int idade;
	private double altura;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void falar ( String falar) {
		System.out.println(falar);
	}
	
	public void andar ( String andar) {
		System.out.println(andar);
	}

}
