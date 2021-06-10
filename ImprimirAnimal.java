package aula06.correcao.transforma.interfac;

public class ImprimirAnimal {

	public static void main(String[] args) {
		
		Preguica novaPreguica = new Preguica();
		Cachorro novoCachorro = new Cachorro();
		Cavalo novoCavalo = new Cavalo();
		
		novaPreguica.somAnimal();
		novaPreguica.subir();
		novaPreguica.correr();
		
		novoCachorro.somAnimal();
		novoCachorro.subir();
		novoCachorro.correr();
		
		novoCavalo.somAnimal();
		novoCavalo.correr();
		
	}
}