package br.com.exercicio04;

public class Funcionario {
	
	double salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(double salario) {
		this.salario = salario;
	}
	
	public void aumento (double valorAumento) {
		if (valorAumento > 0) {
	        this.salario += valorAumento;
	        System.out.println("Aumento realizado!");
	    } else {
	        System.out.println("Valor de aumento inválido!");
	    }
	}
	
	public double verificarSalario() {
		return this.salario;
	}
}
