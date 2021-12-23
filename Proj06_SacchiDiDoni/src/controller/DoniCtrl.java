package controller;

import model.Babbo;
import model.Dono;
import model.Sacco;

public class DoniCtrl {
	
	Babbo babbo;
	Dono dono;
	Sacco sacco;
	
	public void aggiungiBabbo(String nome) {
		
		babbo = new Babbo(nome);
		
	}
	public Babbo getBabbo() {
		return babbo;
	}
	
	public void aggiungiDoni(String descrizione , double peso) {
		dono = new Dono (descrizione, peso);
		aggiungiDonoAlSacco();
	}
	
	public Dono getDono () {
		return dono;
	}
	public void aggiungiSacco(int id) {
		
		sacco = new Sacco(id);
	}
	
	public void aggiungiDonoAlSacco(int pos) {
		this.sacco.getDoni()[pos] = this.dono;
	}
		public void aggiungiDonoAlSacco() {
			int pos = primaposizioneLibera();
			if(pos > -1)
			this.sacco.getDoni()[pos] = this.dono;
			else
				System.out.println("non c'è posto nel sacco!!!");
		
	}
	public Sacco getSacco() {
		return sacco;
	}	
	public void assegnaSacco() {
		this.babbo.setSacco(sacco);
	}
	public double getPesoSacco() {
		double peso =0;
		for (int i = 0; i < sacco.getDoni().length; i++) {
			if (sacco.getDoni()[i] !=null) // evito nullpointerexception
			peso += sacco.getDoni()[i].getPeso();// rischio nullpointrexception
			
		}
		return peso;
	}
	private int primaposizioneLibera() {
		for (int i = 0; i < sacco.getDoni().length; i++) {
			if (sacco.getDoni()[i]== null)
				return i;
		}
		return -1;
	}

}
