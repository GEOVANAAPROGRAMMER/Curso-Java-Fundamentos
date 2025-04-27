package br.com.exercicio03;

public class Produto {

	String nome;
	double preco;
	int qntEstoque;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double preco, int qntEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.qntEstoque = qntEstoque;
	}
	
	public void comprar (int qntCompra) {
		
		this.qntEstoque += qntCompra;
		
		System.out.println("Compra realizada!");
		
	}
	
	public void vender (int qntCompra) {
		if (qntEstoque >= qntCompra) {
			
			this.qntEstoque -= qntCompra;
			System.out.println("Venda realizada!");
			
		} else
			System.out.println("Venda não realizada. Estoque insuficiente!");
		
	}
	
	public int verificarEstoque() {
		return this.qntEstoque;
	}

}
