package exercicios.pdv;

public class Pagamento {
	protected double valor;
	protected double contaGeral= 0;
	
	public Pagamento(double valor) {
		this.valor = valor;
	}
	
	public double getContaEmpresa() {
		return contaGeral;
	}
	
	public void setContaEmpresa(double contaEmpresa) {
		this.contaGeral = contaEmpresa;
	}
	
	 public void pagar() {
	    this.contaGeral += valor;
	    System.out.println("Pagamento genérico no valor de R$ " + valor);
	 }

}
