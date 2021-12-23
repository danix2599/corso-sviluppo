package lab01;

public class ProvaInteri {
	
	int a,b; 

	public static void main(String[] args) {
		
		int a,b;// locali che devono essere dichiarate e inizializzate
		a= 4; // è un var quindi posso cambiarlo
		b= 4;
		
		final int RIGHE = 10;
		final int COLONNE = 10;
	
		
		
		for (int i = 1; i <= RIGHE; i++) {
			//innestare un seconddìo ciclo for
			for (int j = 1; j <= COLONNE; j++) {
				
				System.out.print(i*j + "\t");
				
			}
			
			
			System.out.println();
			
		}
		

	}

}
