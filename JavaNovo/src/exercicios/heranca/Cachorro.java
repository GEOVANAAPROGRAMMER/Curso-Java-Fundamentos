package exercicios.heranca;

public class Cachorro extends Animal {
	
	// Atributos
	private String uivado = "Uivado: AUUUUUUUUU";
	
	// Construtor padrão
	public Cachorro() {
		
	}
	
	// GET -- Para leitura, sempre retorna
	public String getUivado() {
		return uivado;
	}
	
	// SET -- Para editar, normalmente é void
	public void setUivado(String uivado) {
		this.uivado = uivado;
	}
	
	@Override
	public String falar() {
		super.falar();
		
		String som = "O som que o cachorro faz é: AUAUAUAU";
		return som;
	}

}
