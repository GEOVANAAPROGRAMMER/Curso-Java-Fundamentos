package br.com.exercicio2;

public class Funcionario extends Pessoa {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double salario;
	
	public Funcionario () {
		
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void calcularBonus () {
		this.salario += this.salario * 0.1;
		
	}

}
