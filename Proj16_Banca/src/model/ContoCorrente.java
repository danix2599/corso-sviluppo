package model;

import java.util.ArrayList;

public class ContoCorrente {

	private double saldo;
	private ArrayList<Cliente> titolari; 
	
	private int numero;
	private static int counter =1;
		
	public ContoCorrente(Cliente c) {
		this.numero=counter++;
		this.titolari=new ArrayList<Cliente>();
		this.saldo=0;
		this.titolari.add(c);
		}
	public void addTitolari(Cliente c) {
		this.titolari.add(c);
		
	}
	
	public void versamenti (double denari) {
		
		this.saldo += denari;
		
	}
	public void prelievo (double denari) {
		if (this.saldo >= denari) {
		
		this.saldo -= denari;
		}
	}
	public int getNumero() {
		return numero;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContoCorrente [saldo=");
		builder.append(saldo);
		builder.append(", titolari=");
		builder.append(titolari);
		builder.append(", numero=");
		builder.append(numero);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
