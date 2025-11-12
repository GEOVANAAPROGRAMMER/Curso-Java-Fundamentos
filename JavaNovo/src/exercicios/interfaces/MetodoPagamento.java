package exercicios.interfaces;

//A interface é como um CONTRATO: quem "assinar" precisa implementar esses métodos.
public interface MetodoPagamento {
	
	// Quem implementar PRECISA definir como o pagamento vai acontecer
	void pagar(double valor);
	
	// Quem implementar PRECISA definir o que o comprovante vai mostrar
	String emitirComprovante();

}
