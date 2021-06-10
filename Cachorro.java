package aula06.correcao.transforma.interfac;

public class Cachorro extends AnimalSuper implements Animal {

	public void subir() {
		System.out.println("Cachorro subindo...");
		
	}

	@Override
	public void somAnimal() {
		System.out.println("O som do Cachorro: au au!");
		
	}

	@Override
	public void correr() {
		System.out.println("Cachorro correndo...");
		
	}
}
