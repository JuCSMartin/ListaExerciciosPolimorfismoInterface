package aula06.correcao.transforma.interfac;

public class Preguica extends AnimalSuper implements Animal {

	@Override
	public void somAnimal() {
		System.out.println("Som da preguiça: zzZ zZz");
		
	}

	@Override
	public void correr() {
		System.out.println("A preguiça corre em sua própria velocidade...");
		
	}
	
	public void subir() {
		System.out.println("Preguiça subindo...");
	}

}
