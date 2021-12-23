package controller;

import model.Contatto;

public class RublicaController {
	
	private Contatto[] contatti = new Contatto[10];
	
	public void addContatto(String nome , String numero) {
		
		Contatto c = new Contatto(nome, numero);
		int pos = trovapos();
		if(pos>-1)
			Conttati[pos] = c;
		else 
	}

	private int trovapos() {
		
		for (int i = 0; i < contatti.length; i++) {
			if (contatti[i]== null)
				return i;
		}
		return -1;
	}

	}


