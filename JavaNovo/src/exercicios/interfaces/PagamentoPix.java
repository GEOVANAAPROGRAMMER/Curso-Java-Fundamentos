package exercicios.interfaces;

public class PagamentoPix implements MetodoPagamento {
	
	private double valor;

	@Override
	public void pagar(double valor) {
		this.valor = valor;
		System.out.println("Pagamento com pix realizado!");
	}

	@Override
	public String emitirComprovante() {
		String comprovante = "Compra no valor de R$ " + valor;
		return comprovante;
	}

}
