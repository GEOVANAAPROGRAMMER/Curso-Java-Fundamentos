package exercicios.interfaces;

public class PagamentoCartao implements MetodoPagamento {
	
	private double valor;

	@Override
	public void pagar(double valor) {
		this.valor = valor;
		System.out.println("Pagamento com cartão realizado!");
	}

	@Override
	public String emitirComprovante() {
		String comprovante = "Compra no valor de R$ " + valor;
		return comprovante;
	}

}
