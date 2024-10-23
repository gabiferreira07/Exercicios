package Exercicios;

public class MainBrinquedo {

	public static void main(String[] args) {

		Brinquedo carro = new Carro("Vermelho", "Carro", 120, "Carrinho");
		carro.mover();
		
		Brinquedo moto = new Moto("Preto", "Moto", 80, "Motinha");
		moto.mover();
		
		Brinquedo navio = new Navio("Branco", "Navio", 40, "Naviozinho");
		navio.mover();
	}
}