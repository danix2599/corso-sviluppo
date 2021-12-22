package interfaccia;

import java.util.Scanner;

import logica.Calcolatrice;

public class ProvaCalcolatrice {

	public static void main(String[] args) {
		
		//dichiarazione  assegnazione   inizializzazione
		Calcolatrice calc1 = new Calcolatrice(); // metodo costruttore

		double res = calc1.addizione(12.5, 13.7);
		System.out.println(res);
		
		Calcolatrice calc2 = new Calcolatrice();
		
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("benvenuto nella calcolatrice super!");
		
		System.out.println("inserisci il primo addendo");
		
		double addendo1 = scan1.nextDouble();
        
		scan1.nextLine();//consuma il fine linea
		
		System.out.println("inserisci il secondo addendo");
		
		double addendo2 = scan1.nextDouble();
		
		scan1.nextLine();//consuma il fine linea
		
		System.out.println("Il risultato dell'addizione è: ");
		System.out.println(      calc2.addizione(addendo1,addendo2));
		System.out.println(      calc2.sottrazione(addendo1,addendo2));
		System.out.println(      calc2.multiplicazione(addendo1,addendo2));
		System.out.println(      calc2.divisione(addendo1,addendo2));
		
	}

}
