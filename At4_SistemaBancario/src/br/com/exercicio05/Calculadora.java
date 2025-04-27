package br.com.exercicio05;

public class Calculadora {
	
	double numUm, numDois, result;
	
	public Calculadora () {
		
	}
	
	public Calculadora (double numUm, double numDois) {
		this.numUm = numUm;
		this.numDois = numDois;
	}

	public double somar(double numUm, double numDois) {
		return this.result = numUm + numDois;
	}
	
	public double subtrair(double numUm, double numDois) {
		return this.result = numUm - numDois;
	}


	public double multiplicar(double numUm, double numDois) {
		return this.result = numUm * numDois;
	}
	
	public double dividir(double numUm, double numDois) {
		if (numDois != 0) {
	        return this.result = numUm / numDois;
	    } else {
	        System.out.println("Erro: divisão por zero não é permitida!");
	        return 0;
	    }
	}
}
