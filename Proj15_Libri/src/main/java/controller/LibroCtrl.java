package controller;

import java.util.ArrayList;

import model.Libro;

public class LibroCtrl {
	
	private ArrayList<Libro>  libri  ;
	
	public LibroCtrl () {
		
		this.libri = new ArrayList<Libro>();
		
		//init();
	}
	
	//public void init() {
		
		//this.libri.add(new Libro("vita",12));
		//this.libri.add(new Libro("bici",12));
		//this.libri.add(new Libro("boh",12));
		//this.libri.add(new Libro("morte",12));
		
	//}
	
	public void addlibro (String titolo , double prezzo) {
		
		Libro l = new Libro (titolo , prezzo);
		libri.add(l);
		
	}
	
	public ArrayList<Libro> getLibro() {
		
		return libri;
	}
}
