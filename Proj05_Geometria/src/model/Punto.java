package model;

public class Punto {
	
	int x;//0
	int y;//0
	
	//costruttore senza argomenti
	public Punto( ) {
		this.x = 0;
		this.y = 0;
	}
	
	public Punto(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	/**
	 * metodo  stampa punto per punto
	 * @return ritorna la stringa che rappresenta il punto es (5,4)
	 */
	public String stampaPunto() {
		return "(" + x + "," + y +")"; //(4,5)
	}

}
