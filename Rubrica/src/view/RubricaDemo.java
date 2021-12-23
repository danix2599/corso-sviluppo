package view;

import controller.RublicaController;
import model.Contatto;

public class RubricaDemo {

	public static void main(String[] args) {
		
		RublicaController ctrl = new RublicaController();

		ctrl.addContatto("pippo", "3321545215");
		ctrl.addContatto("pino", "3321545215");
		ctrl.addContatto("pippo", "3321545215");
		ctrl.addContatto("pippo", "3321545215");
		ctrl.addContatto("pippo", "3321545215");
		ctrl.addContatto("pippo", "3321545215");
		ctrl.addContatto("pippo", "3321545215");
		ctrl.addContatto("pippo", "3321545215");
		
		for (Contatto c : ctrl.getContatto() ) {
			System.out.println(c.getNumero());
		}
	
	}

}
