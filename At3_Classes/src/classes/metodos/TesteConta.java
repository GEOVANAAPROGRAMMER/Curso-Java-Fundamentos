

package classes.metodos;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta minhaConta = new Conta();
		
		minhaConta.recuperarSaldo();
		
		System.out.println("Saldo inicial: R$ " + minhaConta.recuperarSaldo());
		
		minhaConta.depositar(300.00);
		
		System.out.println("Saldo após o depósito: R$ " + minhaConta.recuperarSaldo());
		
		// Exercício 1
		minhaConta.sacar(-10);
		
		System.out.println("Saldo após o saque: R$ " + minhaConta.recuperarSaldo());
		
	}

}
