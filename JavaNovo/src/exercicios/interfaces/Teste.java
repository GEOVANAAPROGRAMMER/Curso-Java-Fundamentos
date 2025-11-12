package exercicios.interfaces;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da compra R$: ");
		double valor = sc.nextDouble();
		
		System.out.println("Digite a forma de pagamento: /n[PIX ou CARTÃO]");
		String formaPag = sc.next();

		if (formaPag.equalsIgnoreCase("PIX")) {
			PagamentoPix pix = new PagamentoPix();
			pix.pagar(valor);
			System.out.println(pix.emitirComprovante());
		} else if (formaPag.equalsIgnoreCase("CARTÃO")) {
			PagamentoCartao cartao = new PagamentoCartao();
			cartao.pagar(valor);
			System.out.println(cartao.emitirComprovante());
		} else {
			System.out.println("Operação inválida");
		}
		
		sc.close();
	}

}
