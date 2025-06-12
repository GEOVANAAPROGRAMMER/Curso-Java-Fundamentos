package br.com.array;

public class ArrayProdutos {

	public static void main(String[] args) {

		// Instanciando o Array
		Produtos[] produtos = new Produtos[2];
		
		// Instanciando a classe Produtos
		Produtos prod1 = new Produtos();
		prod1.setNome("Maçã");
		prod1.setDescricao("Gala");
		prod1.setValor(4.5f);
		
		// Instanciando a classe Produtos
		Produtos prod2 = new Produtos();
		prod2.setNome("Laranja");
		prod2.setDescricao("Lima");
		prod2.setValor(3.99f);

		produtos[0] = prod1;
		produtos[1] = prod2;
		
		// O "for" vai rodar do 0 até o tamanho do objeto "produtos", conseguimos ver o tamanho através do length
		// Print utilizando o método sobrecarregado "toString" para exibir os dados do produto de forma legível
		for (int i = 0; i < produtos.length; i++) {
			System.out.println(produtos[i]);
		}
		
		System.out.println("\n");
		
		// Este "for-each" percorre cada objeto do tipo Produtos presente no array "produtos",
		// atribuindo temporariamente cada um à variável "prod" para que possamos acessar seus dados.
		for (Produtos prod: produtos) {
			System.out.println(prod.toString());
		}
		
		System.out.println("\n");
		
		// 10 corredores com três prateleiras cada
		Produtos[][] localizacaoProduto = new Produtos[10][3];
		
		localizacaoProduto[0][0] = prod1;
		localizacaoProduto[9][2] = prod2;
		
		System.out.println("Localizando produto pelo número do corredor e da prateleira: \n" +localizacaoProduto[9][2].getNome());
		
	}

}























