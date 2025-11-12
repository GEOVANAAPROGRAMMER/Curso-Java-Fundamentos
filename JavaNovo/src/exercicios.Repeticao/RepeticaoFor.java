package exerciciosRepeticao;

public class RepeticaoFor {

	public static void main(String[] args) {

		int qtdProduto = 5;
		
//		for (int i = 1; i < qtdProduto; i++) {
//			System.out.println("Item " +i+ " adicionado");
//		}
//		
		
		for (int i = qtdProduto; i >= 1; i--) {
			System.out.println("Item " + i + " retirado");
		}
	}

}
