package model;
import control.Imprimivel;

public abstract class ContaBancaria implements Imprimivel<ContaBancaria>{
	private long numero;
	protected double saldo;
	
	public ContaBancaria(long numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
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
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		if (this.saldo - valor >= 0.0) this.saldo -= valor;
	}
	
	public void transferir(double valor, ContaBancaria ContaDe, ContaBancaria ContaPara) {
		ContaDe.sacar(valor);
		ContaPara.depositar(valor);
	}
}
