package classes.metodos;

public class Conta {
	
	double saldo;
	
	public double recuperarSaldo() {
		
		return saldo;
	}
	
	public void depositar(double valorDeposito) {
		saldo = saldo + valorDeposito;
	}
	
	public void sacar(double valorSaque) {
		if (valorSaque <= 0) {
			System.out.println("Valor inválido!");		
		} else if (saldo >= valorSaque) {
            saldo = saldo - valorSaque;
        } else {
            System.out.println("Saldo insuficiente para saque!");
        }
	}

}
