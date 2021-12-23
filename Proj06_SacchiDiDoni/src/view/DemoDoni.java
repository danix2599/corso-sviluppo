package view;

import controller.DoniCtrl;

public class DemoDoni {

	public static void main(String[] args) {
		DoniCtrl controller = new DoniCtrl();
		
		controller.aggiungiBabbo("Babbo pippo");
		controller.aggiungiSacco(0);
		controller.aggiungiDoni("trenino", 0.5);
		
		
		controller.aggiungiDoni("bambola", 0.4);
		
		controller.aggiungiDoni("palla", 0.3);
		
		controller.aggiungiDoni("videogame", 0.3);
        controller.aggiungiDoni("bambola", 0.4);
		
		controller.aggiungiDoni("palla", 0.3);
		
		controller.aggiungiDoni("videogame", 0.3);
		
		
		controller.assegnaSacco();
		
		String contenuto = controller.getBabbo().getSacco().etichetta();
		
		System.out.println(contenuto);
		double pesoSacco = controller.getPesoSacco();
		
		System.out.println("il sacco di " +controller.getBabbo().getNome() + " pesa" + pesoSacco + "Kg");

	}

}
