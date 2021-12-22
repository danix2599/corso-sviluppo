package view;

import java.util.Iterator;

import model.Dado;

public class LanciaDadi {

	public static void main(String[] args) {
	
		Dado d1 = new Dado();
		Dado d2 = new Dado(6, "rosso");
		Dado d3 = new Dado();
		
		final int NUMERO_LANCI = 1000000;
		int contaVittorie= 0;
		
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < NUMERO_LANCI; i++) {
			int res1 = d1.lancia();
			int res2 = d2.lancia();
			int res3 = d3.lancia();
			
		if (res1==res2 && res2==res3) {
			
		    contaVittorie ++;
	
		}
		}long stop = System.currentTimeMillis();
		System.out.println("l'elaborazione è durato :" +(stop-start) + "ms");
		System.out.println("hai vinto " + contaVittorie + " volte");
		double percentuale = (double)contaVittorie / NUMERO_LANCI*100;
		System.out.println("la percentuale di vittoria è " + percentuale + "%");
		
	}

}
