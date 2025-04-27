package br.com.exemplo.banco;

public class Conta {
	
	// variáveis
	int agencia;
	int numero;
	double saldo;
	
	// Construtor padrão
	public Conta() {
		
	}

	// Construtor personalizado
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	};
	
	// Métodos
	public void depositar(double valor) {
		
		this.saldo += valor;
	}
	
	public void retirar(double valor) {
		
		this.saldo -= valor;
	}
	
	public double verificarSaldo() {
		return this.saldo;
	}

}
