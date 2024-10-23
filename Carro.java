package Exercicios;

public class Carro  extends Brinquedo{

	public Carro(String cor, String tipo, int velocidade, String nome) {
		super(cor, tipo, velocidade, nome);
	}
	@Override
	public void mover() {
		System.out.println("O carro está se movendo.");
	}

}
