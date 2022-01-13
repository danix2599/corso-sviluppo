package view;

import java.util.Scanner;

import controller.LibroCtrl;
import model.Libro;

public class LibroDemo {

	public static void main(String[] args) {
		LibroCtrl controller = new LibroCtrl(); 
		Scanner sc = new Scanner(System.in); 
		
		for (int i = 0 ;  i < 5 ; i++) {
			
		
		System.out.println("inserisci il titolo del libro\n ");
		String titolo = sc.next();
		if(sc!=null){
			
			controller.addlibro(titolo, 10);
			
		}
		
		}
		 for (Libro l: controller.getLibro()){ 

			System.out.println(l.getTitolo()); 
			
	 } 


	}

}
