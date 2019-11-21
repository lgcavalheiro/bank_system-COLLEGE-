package model;
import control.Imprimivel;

public abstract class ContaBancaria implements Imprimivel<ContaBancaria>{
	private long numero;
	private double saldo;
	
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
		System.out.println(this.saldo);
	}
	
	public void sacar(double valor) {
		if (this.saldo - valor > 0.0) this.saldo -= valor;
		System.out.println(this.saldo);
	}
	
	public void transferir(double valor, ContaBancaria ContaDe, ContaBancaria ContaPara) {
		ContaDe.sacar(valor);
		ContaPara.depositar(valor);
	}
}
