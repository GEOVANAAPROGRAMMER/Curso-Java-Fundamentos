package classes.atributos;

public class TesteConta {

	public static void main(String[] args) {


		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();
		Conta contaInvestimento = new Conta();
		
		contaCorrente.numero = 11;
		contaCorrente.saldo = 20.5;
		contaCorrente.cliente.nome = "Geovana";
		contaCorrente.cliente.idade = 21;
		
		
		contaPoupanca.numero = 22;
		contaPoupanca.saldo = 1000;
		contaPoupanca.cliente.nome = "Guilherme";
		contaPoupanca.cliente.idade = 18;
		
		contaInvestimento.numero = 33;
		contaInvestimento.saldo = 40;
		contaInvestimento.cliente.nome = "Gustavo";
		contaInvestimento.cliente.idade = 20;
		
		System.out.println(contaCorrente.numero);
		System.out.println(contaCorrente.saldo);
		System.out.println(contaCorrente.cliente.nome);
		System.out.println(contaCorrente.cliente.idade);

	}

}
