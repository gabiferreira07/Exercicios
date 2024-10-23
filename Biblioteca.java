package Exercicios;

public class Biblioteca {

	private String nome;
	private Livro livro;  

	public Biblioteca(String nome, Livro livro) {
		this.nome = nome;
		this.livro = livro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void exibirInfo() {
		System.out.println("Biblioteca: " + nome);
		if (livro != null) {
			System.out.println("Livro disponível: " + livro.getInfo());
		} else {
			System.out.println("Nenhum livro disponível.");
		}
	}
}

