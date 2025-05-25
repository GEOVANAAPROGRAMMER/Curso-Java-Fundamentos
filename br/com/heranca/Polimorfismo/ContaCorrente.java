package br.com.heranca.Polimorfismo;

public class ContaCorrente extends Conta {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tipo;
	private double chequeEspecial;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	public double getSaldoDisponivel () {
		return super.getSaldo() + chequeEspecial;
	}
	
	// Utilizando o método da classe-mãe com uma variação. Polimorfismo
	@Override
	public void retirar(double valor) {
		valor += 10.0;
		super.retirar(valor);
	}

}
