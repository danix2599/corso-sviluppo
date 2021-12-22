package model;

public class Dado {
	
	// modificatori di accesso public private e niente (package)
	private int nfacce;
	private String colore;
	
	public Dado() {
		this.nfacce = 6 ;
		this.colore = "bianco";
	}//costruttore di default, inizia con il maiuscolo anche se è un metodo e non da nulla in ritorno ,deve chiamarsi come l'oggetto
		
		public Dado(int facce, String colore) {// new Dado(6, "bianco");
			
			this.nfacce = facce;
			this.colore = colore; 
			
		}
		
		public int lancia() {
			
			double casuale = Math.random();// valore casuale tra (0.0<1.0)
			
			// 6 facce 1-6 (casuale * facce) + 1 = 1-6
			int res =(int)(Math.random()*nfacce)+1;
			return res;
		}
	

}
