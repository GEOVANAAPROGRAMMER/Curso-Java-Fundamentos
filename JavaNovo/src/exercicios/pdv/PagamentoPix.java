package exercicios.pdv;

public class PagamentoPix extends Pagamento {
	
	private double contaPix;
	

	public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public void pagar() {
        // Soma no total geral
        super.pagar();

        // Soma no total específico do Pix
        this.contaPix += valor;

        System.out.println("Pagamento realizado via PIX no valor de R$ " + valor);
    }

    public double getContaPix() {
        return contaPix;
    }

}
