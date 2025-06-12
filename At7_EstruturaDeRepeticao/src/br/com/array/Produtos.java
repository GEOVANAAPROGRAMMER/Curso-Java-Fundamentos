package br.com.array;

public class Produtos {
	
	private String nome;
	private String descricao;
	private float valor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
		
	// Sobrescreve o método toString() da classe Object para exibir os dados do produto de forma legível
	@Override
	public String toString() {
		return "Produto [nome= "+ nome + ", descrição= "+descricao+ ", valor= "+valor+"]";
	}
}
