package exercicios.heranca;

public class Animal {
	
	private String locomove;
	private String seAlimenta;
	private String falar;
	
	// Construtor padrão
	public Animal () {
		
	}
	
	public String getLocomove() {
		return locomove;
	}
	
	public void setLocomove(String locomove) {
		this.locomove = locomove;
	}
	
	public String getSeAlimenta() {
		return seAlimenta;
	}
	
	public void setSeAlimenta(String alimenta) {
		this.seAlimenta = alimenta;
	}
	
	public String getFalar() {
		return falar;
	}
	
	public void setFalar(String falar) {
		this.falar = falar;
	}
	
	public String falar() {
		falar = "Todo animal faz um som";
		return falar;
	}

}
