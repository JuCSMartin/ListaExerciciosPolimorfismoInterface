package aula06.correcao.transforma.interfac;

public class Preguica extends AnimalSuper implements Animal {

	@Override
	public void somAnimal() {
		System.out.println("Som da pregui�a: zzZ zZz");
		
	}

	@Override
	public void correr() {
		System.out.println("A pregui�a corre em sua pr�pria velocidade...");
		
	}
	
	public void subir() {
		System.out.println("Pregui�a subindo...");
	}

}
