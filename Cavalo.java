package aula06.correcao.transforma.interfac;

public class Cavalo extends AnimalSuper implements Animal {

	@Override
	public void somAnimal() {
		System.out.println("Som do cavalo: hiin iin in");
		
	}

	@Override
	public void correr() {
		System.out.println("Cavalo correndo...");
		
	}


}
