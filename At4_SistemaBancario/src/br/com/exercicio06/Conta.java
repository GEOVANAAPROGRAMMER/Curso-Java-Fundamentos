// Javabeans e Encapsulamento
package br.com.exercicio06;

import java.io.Serializable;

public class Conta implements Serializable {
	
	/**
	 * Identificando qual é o objeto que será serializado, convertido para bit
	 */
	private static final long serialVersionUID = 1L;
	
	private int agencia;
	private int numero;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta (int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	
	// Criando métodos para acessar e alterar atributos
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	// Criando métodos para depositar e retirar saldo
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	

}
