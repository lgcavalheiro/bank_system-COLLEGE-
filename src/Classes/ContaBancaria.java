package Classes;
import Interfaces.Imprimivel;

public abstract class ContaBancaria implements Imprimivel<ContaBancaria>{
	private long numero;
	private double saldo;
	
	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		//adicionar funcionalidades
	}
	
	public void sacar(double valor) {
		//adicionar funcionalidades
	}
	
	public void transferir(double valor, ContaBancaria ContaDe, ContaBancaria ContaPara) {
		//adicionar input do usuário
		ContaDe.sacar(valor);
		ContaPara.depositar(valor);
	}
}
