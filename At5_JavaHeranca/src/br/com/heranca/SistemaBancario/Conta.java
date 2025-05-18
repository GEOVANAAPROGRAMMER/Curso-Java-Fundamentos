package br.com.heranca.SistemaBancario;

import java.io.Serializable;

public class Conta implements Serializable  {
	
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

	public void depositar (double saldo) {
		this.saldo += saldo;
	}
	
	public void retirar (double saldo) {
		this.saldo -= saldo;
	}

}
