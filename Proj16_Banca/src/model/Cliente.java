package model;

import java.time.LocalDate;

public class Cliente {
	
	private String nome;     
	private String cognome;
	private int eta;
	private LocalDate dataNascita;
	
	public Cliente(String nome, String cognome, String data) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita=LocalDate.parse(data) ;
		LocalDate stop = LocalDate.now("Europe/Rome");
		long years =java.time.temporal.ChronoUnit.MONTHS.between(dataNascita, stop);
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}
	
	
	
	
}
