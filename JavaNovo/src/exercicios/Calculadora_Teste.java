package exercicios;

public class Calculadora_Teste {
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora(10, 50);
		
		System.out.println("Soma: " + calc.soma());
		System.out.println("Subtração: " + calc.subt());
		System.out.println("multiplicação: " + calc.mult());
		System.out.println("Divisão: " + calc.div());
	}

}
