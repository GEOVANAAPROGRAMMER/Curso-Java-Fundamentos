package br.com.exercicio02;

public class VerificadorDeNegativos {
	
	int agencia;
	int num;
	double saldo;
	
	public VerificadorDeNegativos () {
		
	}

	public VerificadorDeNegativos(int agencia, int num, double saldo) {
		if (saldo >= 0) {
			this.agencia = agencia;
			this.num = num;
			this.saldo = saldo;
		} else {
			this.saldo = 0;
			System.out.println("Saldo inicial inválido. Definido como R$0.00");
		}
	}
	
	public double verificarSaldo() {
		return this.saldo;
	}
}
