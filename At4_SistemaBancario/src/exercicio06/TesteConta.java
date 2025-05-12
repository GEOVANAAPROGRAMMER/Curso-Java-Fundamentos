package br.com.exercicio06;

public class TesteConta {
	
	public static void main(String[] args) {
		
		// Criação do objeto Conta Corrente
		Conta cc = new Conta ();
		
		// Acessando as informações através dos métodos, devido o encapsulamentos da classe Conta
		cc.setAgencia(123);
		cc.setNumero(321);
		cc.depositar(50.0);
		
		System.out.println("Saldo inicial da conta corrente: R$" + cc.getSaldo());
		
		cc.depositar(800);
		
		System.out.println("Saldo após o deposito: R$" + cc.getSaldo());
		
		cc.retirar(300);
		
		System.out.println("Saldo apoós a retirada: R$" + cc.getSaldo());
		System.out.println();
		

	}

}
