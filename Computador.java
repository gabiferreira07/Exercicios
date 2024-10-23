package Exercicios;

public class Computador {

	private String modelo;
	private Processador processador;  // Relacionamento de composição

	public Computador(String modelo, String marcaProcessador, String frequenciaProcessador) {
		this.modelo = modelo;
		this.processador = new Processador(marcaProcessador, frequenciaProcessador);  // Composição forte
	}

	public void exibirInfo() {
		System.out.println("Modelo do Computador: " + modelo);
		System.out.println("Processador: " + processador.getInfo());
	}
}