package br.com.exercicio3;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQtd() {
		return this.quantidade;
	}
	
	
	public void comprar (int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void vender (int quantidade) {
		this.quantidade -= quantidade;
	}

}




