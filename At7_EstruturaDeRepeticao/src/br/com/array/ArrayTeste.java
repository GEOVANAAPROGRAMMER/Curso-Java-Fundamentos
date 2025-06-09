// Array com dados dados primitivos

package br.com.array;

public class ArrayTeste {

	public static void main(String[] args) {
		
		float[] valores = new float[5];
		
		valores[0] = 10;
		valores[1] = 20;
		valores[2] = 30;
		valores[3] = 40;
		valores[4] = 50;
		
		System.out.println(valores[4]);
		
		float[] caixa = new float[] {10, 20, 30, 40, 50, 60, 70};
		
		System.out.println(caixa[6]);
	}
}
