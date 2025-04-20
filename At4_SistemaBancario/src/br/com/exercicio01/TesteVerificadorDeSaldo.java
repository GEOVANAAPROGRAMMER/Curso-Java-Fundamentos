package br.com.exercicio01;


public class TesteVerificadorDeSaldo {

	public static void main(String[] args) {

		VerificadorDeSaldo cc = new VerificadorDeSaldo(10.0);
		
		System.out.println("Saldo inicial: R$" + cc.verificarSaldo());
		
		cc.retirar(10);

	}

}
