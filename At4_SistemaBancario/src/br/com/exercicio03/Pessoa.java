package br.com.exercicio03;

public class Pessoa {

	public static void main(String[] args) {


		Produto prod = new Produto("carrinho", 250, 300);
		
		prod.comprar(30);
		
		System.out.println("Quantidade de " + prod.nome + " em estoque: " + prod.verificarEstoque());
		
		prod.vender(300);
		
		System.out.println("Quantidade de " + prod.nome + " em estoque: " + prod.verificarEstoque());

	}

}
