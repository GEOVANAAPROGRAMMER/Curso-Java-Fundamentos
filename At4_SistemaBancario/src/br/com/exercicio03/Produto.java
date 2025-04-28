package br.com.exercicio03;

/**
 * Classe que abstrai um Produto.
 * Representa um produto com nome, preço e quantidade em estoque.
 * 
 * @author Geovana Ribeiro
 * @version 1.0
 */
public class Produto {

    String nome;
    double preco;
    int qntEstoque;

    /**
     * Construtor vazio.
     */
    public Produto() {
    }

    /**
     * Construtor para criar um produto com nome, preço e quantidade inicial.
     * 
     * @param nome        Nome do produto.
     * @param preco       Preço do produto.
     * @param qntEstoque  Quantidade inicial disponível no estoque.
     */
    public Produto(String nome, double preco, int qntEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qntEstoque = qntEstoque;
    }

    /**
     * Adiciona uma quantidade comprada de produtos ao estoque.
     * 
     * @param qntCompra Quantidade de produtos comprados.
     * @see #vender(int)
     */
    public void comprar(int qntCompra) {
        this.qntEstoque += qntCompra;
        System.out.println("Compra realizada!");
    }

    /**
     * Retira uma quantidade vendida de produtos do estoque,
     * verificando se há estoque suficiente.
     * 
     * @param qntVenda Quantidade de produtos vendidos.
     * @see #comprar(int)
     */
    public void vender(int qntVenda) {
        if (qntEstoque >= qntVenda) {
            this.qntEstoque -= qntVenda;
            System.out.println("Venda realizada!");
        } else {
            System.out.println("Venda não realizada. Estoque insuficiente!");
        }
    }

    /**
     * Retorna a quantidade atual de produtos no estoque.
     * 
     * @return Quantidade de produtos disponível no estoque.
     */
    public int verificarEstoque() {
        return this.qntEstoque;
    }
}
