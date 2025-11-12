package exercicios.abstrata;

public class Gerente extends Funcionario {
	
	private double bonus;
	
	public Gerente (String nome, double salario)	{
		super(nome, salario);
	}

	@Override
	public double calcularBonus() {
		bonus = getSalario() * 0.20;
		return bonus + getSalario();	
	}

}
