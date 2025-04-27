package br.com.exemplo.banco;

public class TesteConta {

	public static void main(String[] args) {
		
		// Objeto
		Conta cc = new Conta(7374, 289986, 40565.0);
		
		System.out.println(cc.verificarSaldo());
		
		cc.retirar(250);
		
		System.out.println(cc.verificarSaldo());
		
		cc.depositar(10000.0);
		
		System.out.println(cc.verificarSaldo());
		
		

	}

}
