package Exercicios;

public class MainContaBancaria {

	public static void main(String[] args) {

		ContaBancaria conta = new ContaBancaria("12345-6", 5000.00);
		Cliente cliente = new Cliente("João", conta);

		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("Número da Conta: " + cliente.getConta().getNumero());
		System.out.println("Saldo: " + cliente.getConta().getSaldo());

		// Deposit and Withdraw
		cliente.getConta().depositar(1000);
		System.out.println("Saldo após depósito: " + cliente.getConta().getSaldo());

		cliente.getConta().sacar(1500);
		System.out.println("Saldo após saque: " + cliente.getConta().getSaldo());
	}
}