package br.com.heranca.Polimorfismo;

import java.io.Serializable;

/**
 * 
 */
public class Conta implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int numero;
	private int agencia;
	private double saldo;
	
	public Conta () {
		
	}
	
	public Conta (int numero, int agencia, double saldo) {

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void retirar(double valor) {
		this.saldo -=valor;
	}
	
	public void depositar(double valor) {
		this.saldo +=valor;
	}

}
