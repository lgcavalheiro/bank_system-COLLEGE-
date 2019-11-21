package model;
public class ContaPoupanca extends ContaBancaria {
	private double limite;
	
	public ContaPoupanca(long numero, double saldo, double limite) {
		super(numero, saldo);
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void sacar(double valor) {
		if (this.saldo - valor >= 0.0) this.saldo -= valor;
		else if (this.limite - valor >= 0.0) this.limite -= valor;
	}

	@Override
	public String mostrarDados() {
		System.out.println("Número: " + this.getNumero());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Limite: " + this.limite);
		return "Número: " + this.getNumero() + "\n" +
				"Saldo: " + this.getSaldo() + "\n" +
				"Limite: " + this.limite + "\n";
	}
}
