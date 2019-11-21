package model;
import java.util.ArrayList;

public class Banco {
	public static ArrayList<ContaBancaria> Contas = new ArrayList<>();
	
	public static void inserir(ContaBancaria conta) {
		Contas.add(conta);
	}
	
	public static void remover(long numero) {
		for(ContaBancaria conta : Contas) {
			if(conta.getNumero() == numero) Contas.remove(conta);
		}
	}
	
	public static ContaBancaria procurarConta(long numero) {
		for(ContaBancaria conta : Contas) {
			if(conta.getNumero() == numero) {
				return conta;
			} 
		}
		return null;
	}
}
