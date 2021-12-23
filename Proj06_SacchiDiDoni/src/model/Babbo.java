package model;

public class Babbo {

	private String nome;
	private Sacco sacco;
	public Babbo(String nome) {
	    
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setSacco(Sacco sacco) {
		this.sacco = sacco;
	}
	public Sacco getSacco() {
		return sacco;
	}
	
	
}
