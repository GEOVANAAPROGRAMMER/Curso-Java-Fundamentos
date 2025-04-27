package br.com.exercicio01;

public class VerificadorDeSaldo {
	
	double saldo;
	
	public VerificadorDeSaldo() {
		
	}

	public VerificadorDeSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double verificarSaldo() {
		return this.saldo;
	}
	
	public void retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Valor retirado!");
		} else
			System.out.println("Valor insuficiente para retirada!");
	}
	
	
}
