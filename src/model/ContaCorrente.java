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

	@Override
	public String mostrarDados() {
		System.out.println("Número: " + this.getNumero());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Taxa: " + this.taxaDeOperacao);
		return "Número: " + this.getNumero() + "\n" +
				"Saldo: " + this.getSaldo() + "\n" +
				"Taxa: " + this.taxaDeOperacao + "\n";
	}
}
