package exercicios.heranca;

public class Passaro extends Animal {
	
	private String voa = "Voando ...";
	
	public Passaro() {
		
	}
	
	public String getVoa() {
		return voa;
	}
	
	public void setVoa(String voa) {
		this.voa = voa;
	}
	
    @Override
    public String falar() {
        // Chama o comportamento original (opcional)
        super.falar();

        // Define o som específico do pássaro
        String som = "O som que o pássaro faz é: PIO PIO PIO!";
        return som;
	}
	

}
