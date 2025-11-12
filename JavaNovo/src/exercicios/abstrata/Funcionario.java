package exercicios.abstrata;

public abstract class Funcionario {
	
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// O método calcularBonus() deve ser abstrato, porque cada tipo de funcionário calcula o bônus de um jeito diferente
	public abstract double calcularBonus();

}
