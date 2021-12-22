package view;

public class Gioco {

	public static void main(String[] args) {
// seguenza, selezione, iterazione 
      String sceltaUmano = "pietra";
      String sceltaPc = sceltacasualePc();
      
      String risultato = "";
      
     for (int i = 0; i < 5; i++) {//ciclo che ripete 5 volte le istruzione
		System.out.println("il valore di i è: " +i);
	 
      if (sceltaUmano.equals(sceltaPc)) {
    	  risultato = "pareggio";
      }//fine blocco if
      else {
		 risultato = "non pareggio";
	       }// fine blocco else
      System.out.println(risultato);
     }// fine ciclo for
	
	
	}// main()
	
	// scrivo il metodo per far scegliere casualmente una stringa tra pietra , forbice carta
	public static String sceltacasualePc() {
    	
	String scelta = "";
	
	double casuale = Math.random(); // ottengo un numero reale casuale tra 0.0 e minore di 1.0
	
	if (casuale < 0.33) {
		scelta = "pietra";
		} 
	if (casuale < 0.66) {
			
			scelta = "carta";
			
	}
	else if ( casuale > 0.66) {
			
			scelta = "forbice";
			
		}
	
	return scelta;
	
    }
}// fine classe
