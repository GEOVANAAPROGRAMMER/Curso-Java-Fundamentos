package exercicios;

public class Calculadora {
	double numUm;
	double numDois;
	double result;
	
	// Construtor padrão
	public Calculadora() {
		
	};
	
	// Construtor personalizado
	public Calculadora(double numUm, double numDois) {
		this.numUm = numUm;
		this.numDois = numDois;
	};
	
	public double soma() {
		result = numUm + numDois;
		return result;
	}
	
	public double subt() {
		result = numUm - numDois;
		return result;
	}
	
	public double mult() {
		result = numUm * numDois;
		return result;
	}
	
	public double div() {
		result = numUm / numDois;
		return result;
	}

}
