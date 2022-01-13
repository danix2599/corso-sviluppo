package view;

import controller.GestioneConti;
import model.Cliente;
import model.ContoCorrente;

public class DemoBanca {

	public static void main(String[] args) {
		
		GestioneConti gc= new GestioneConti();
		
		gc.addCliente("Christian", "Del La Fuente", 22);
		
		Cliente c = gc.getCliente("Christian", "Del La Fuente");
	
		gc.apriConto(c);
		
		ContoCorrente conto = gc.getConto(1);
		
		gc.faiVersamento(100, conto);
		gc.faiVersamento(50, conto);
		gc.faiVersamento(200, conto);
		gc.faiVersamento(100, conto);
		
		System.out.println(conto);  
	}

}
