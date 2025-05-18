package br.com.heranca.animal;

public class TesteHeranca {
	
 public static void main(String[] args) {
	 
	 // Objeto criado a partir da classe mãe, só é possível acessar os atributos e métodos da super classe
	 Animal animal = new Cachorro();
	 animal.setAlimenta("Todos os animais se alimentam");
	 animal.setLocomove("Todos os animais se locomovem");
	
 	 // Objeto criado a partir da classe filho (Cachorro)
	 Cachorro cachorro = new Cachorro();
	 
	 cachorro.setAlimenta("Todos os cachorros se alimentam");
	 cachorro.setLatido("Au au au");
	 cachorro.setUivado("Aaaauuuuuuuuuu");
	 
	 // Objeto criado a partir da classe filho (Passaro)
	 Passaro passaro = new Passaro();
	 
	 passaro.setPia("Pio pio pio");
	 
 	}
}
