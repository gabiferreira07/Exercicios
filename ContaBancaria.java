package Exercicios;

public class ContaBancaria {

	private String numero;
	private double saldo;

	public ContaBancaria(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void depositar(double valor) {
		this.saldo += valor;
	}
	public void sacar(double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
}

