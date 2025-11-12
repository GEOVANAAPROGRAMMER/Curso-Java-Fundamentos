package exercicios.pdv;

public class Teste {
	
	public static void main(String[] args) {
	        Pagamento p1 = new Pagamento(150);
	        PagamentoPix p2 = new PagamentoPix(200);

	        System.out.println("---- Pagamentos Genérico ----");
	        p1.pagar();	        
	        System.out.println("---- Pagamentos via PIX ----");
	        p2.pagar();

	        System.out.println("\nSaldo da conta PIX total: R$ " + (p2.getContaPix()));
	        System.out.println("Saldo geral da empresa: R$ " + (p1.getContaEmpresa() + p2.getContaPix()));
	}

}
