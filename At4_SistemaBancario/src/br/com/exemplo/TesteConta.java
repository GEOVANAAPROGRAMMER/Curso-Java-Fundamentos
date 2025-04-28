package br.com.exemplo;

public class TesteConta {
	
	public static void main(String[] args) {
		
		// Criação do objeto Conta Corrente
		Conta cc = new Conta (7374, 28998, 50.0);
		
		System.out.println("Saldo inicial da conta corrente: R$" + cc.verificarSaldo());
		
		cc.depositar(800);
		
		System.out.println("Saldo após o deposito: R$" + cc.verificarSaldo());
		
		cc.retirar(300);
		
		System.out.println("Saldo apoós a retirada: R$" + cc.verificarSaldo());
		System.out.println();
		
		// Criação do objeto Conta Poupança
		Conta cp = new Conta (7374, 28998, 1000.0);
		
		System.out.println("Saldo inicial da conta poupança: R$" + cp.verificarSaldo());
		
		cp.depositar(1200);
		
		System.out.println("Saldo após o deposito: R$" + cp.verificarSaldo());
		
		cp.retirar(300);
		
		System.out.println("Saldo após a retirada: R$" + cp.verificarSaldo());
		
	}

}
