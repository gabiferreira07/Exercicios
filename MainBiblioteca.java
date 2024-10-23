package Exercicios;

public class MainBiblioteca {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis"); 
		Biblioteca biblioteca = new Biblioteca("Biblioteca Central", livro1);

		biblioteca.exibirInfo();
	}
}
