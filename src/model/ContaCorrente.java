package model;
public class ContaCorrente extends ContaBancaria{
	private double taxaDeOperacao;

	public ContaCorrente(long numero, double saldo, double taxaOp) {
		super(numero, saldo);
		this.taxaDeOperacao = taxaOp;
	}
	
	public double getTaxaDeOperacao() {
		return taxaDeOperacao;
	}

	public void setTaxaDeOperacao(double taxaDeOperacao) {
		this.taxaDeOperacao = taxaDeOperacao;
	}
	
	public void sacar(double valor) {
		double valorCorrente = valor + (valor * this.taxaDeOperacao) / 100;
		if (this.saldo - valorCorrente >= 0.0) this.saldo -= valorCorrente;
	}

	@Override
	public String mostrarDados() {
		return "Número: " + this.getNumero() + "\n" +
				"Saldo: " + this.getSaldo() + "\n" +
				"Taxa: " + this.taxaDeOperacao + "\n";
	}
}
