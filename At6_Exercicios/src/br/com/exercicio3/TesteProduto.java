/* 3. Criar uma classe Produto
Atributos: nome, preco, quantidade
Métodos: comprar(int qtd), vender(int qtd)
Crie um método exibirEstoque() para imprimir os dados. */

package br.com.exercicio3;

public class TesteProduto {
	
	public static void main(String[] args) {
		
		Produto prod = new Produto();
		
		prod.setNome("Creme");
		prod.setPreco(50.0);
		
		System.out.println("Nome do produto: " + prod.getNome() + "\nPreço do produto: "+ prod.getPreco());
		
		prod.comprar(5);
		
		System.out.println("\nVocê tem "+ prod.getQtd()+ " produto(s) em estoque !!!");
		
		prod.vender(4);
		
		System.out.println("Você tem "+ prod.getQtd()+ " produto(s) em estoque !!!");
		
	}

}
