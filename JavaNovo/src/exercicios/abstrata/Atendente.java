package exercicios.abstrata;

public class Atendente extends Funcionario {
	
	private double bonus;
	
	public Atendente(String nome, double salario) {
		super(nome, salario);
	}
	
	@Override
	public double calcularBonus() {
		bonus = getSalario() * 0.10;
		return getSalario() + bonus;
	}

}
