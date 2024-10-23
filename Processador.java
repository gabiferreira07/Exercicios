package Exercicios;

public class Processador {
	
	private String marca;
	private String frequencia;

	public Processador(String marca, String frequencia) {
		this.marca = marca;
		this.frequencia = frequencia;
	}

	public String getInfo() {
		return "Marca: " + marca + ", Frequência: " + frequencia;
	}
}