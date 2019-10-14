package Classes;
public class ContaPoupanca extends ContaBancaria {
	private double limite;
	
	@Override
	public void mostrarDados() {
		System.out.println("Número: " + this.getNumero());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Limite: " + this.limite);
	}
}
