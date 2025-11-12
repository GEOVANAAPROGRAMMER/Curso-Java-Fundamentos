package exercicios.heranca;

public class Teste {
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		System.out.println(animal.falar());
		
		Cachorro cachorro = new Cachorro();
		System.out.println(cachorro.falar());
		System.out.println(cachorro.getUivado());
		
		Passaro passaro = new Passaro();
		System.out.println(passaro.getVoa());
		System.out.println(passaro.falar());
		
	}

}
