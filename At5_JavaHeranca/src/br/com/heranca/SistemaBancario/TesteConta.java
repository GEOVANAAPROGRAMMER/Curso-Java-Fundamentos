package br.com.heranca.SistemaBancario;

public class TesteConta {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		
		cc.setAgencia(7273);
		cc.setNumero(289976);
		cc.setTipo("PF");
		cc.setChequeEspecial(200);
		
		System.out.println("Saldo em conta: " + cc.getSaldoDisponivel());
	}

}
