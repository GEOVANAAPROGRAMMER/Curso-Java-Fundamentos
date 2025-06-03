package br.com.heranca.Polimorfismo;

public class TesteConta {
	
	public static void main(String[] args) {
		
		// Utilizando o método e objeto da classe-mãe. O resultado esperado é 900, valor sem taxa
		Conta conta1 = new Conta();
		conta1.depositar(1000);
		conta1.retirar(100);
		
		// Utilizando o método e objeto da classe-filha. O resultado esperado é 890, valor com taxa
		ContaCorrente conta2 = new ContaCorrente();
		conta2.depositar(1000);
		conta2.retirar(100);
		
		// Utilizando a Classe-mãe, e o método e objeto da classe-filha. O resultado esperado é 890, valor com taxa
		Conta conta3 = new ContaCorrente();
		conta3.depositar(1000);
		conta3.retirar(100);
		
		System.out.println("Conta1: " + conta1.getSaldo());
		System.out.println("Conta1: " + conta2.getSaldo());
		System.out.println("Conta1: " + conta3.getSaldo());
	}

}
