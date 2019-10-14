package Classes;
public class ContaCorrente extends ContaBancaria{
	private double taxaDeOperacao;

	@Override
	public void mostrarDados() {
		System.out.println("Número: " + this.getNumero());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Taxa: " + this.taxaDeOperacao);
		
	}
}
