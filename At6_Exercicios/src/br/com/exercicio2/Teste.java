/* 2. Criar uma classe Funcionario com herança
Classe base: Pessoa
Subclasse: Funcionario (atributo salario)
Método: calcularBonus() que retorna 10% do salário. */

package br.com.exercicio2;

public class Teste {
	
	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		
		func.setNome("Pedro");
		func.setIdade(21);
		func.setGenero('M');
		func.setSalario(1000);
		
		func.calcularBonus();
		
		System.out.println("Esse é o valor do Salario do funcionario " + func.getNome() + " após o bonus de 10%: \n" + func.getSalario());
	}

}
