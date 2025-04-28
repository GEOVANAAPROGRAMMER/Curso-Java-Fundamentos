package br.com.exercicio04;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario func = new Funcionario(1600);
		
		func.aumento(800);

		System.out.println("O valor do salário atualizado é : " + func.verificarSalario());
	}

}
