package edu.ort.taller1.tp2.ex;

import edu.ort.taller1.tp2.ex.ex4.clases.Mueble;
import edu.ort.taller1.tp2.ex.ex4.clases.Persona2;
import edu.ort.taller1.tp2.ex.ex4.clases.Vivienda;
import edu.ort.taller1.tp2.ex.ex5.clases.Edificio;

public class Ex5 {

	public static void main(String[] args) {
	
		
		Edificio e = new Edificio("Montaneses", 1234);
		
		Vivienda v1 = new Vivienda("Montaneses", 1234, 4, "C");
		Vivienda v2 = new Vivienda("Montaneses", 1234, 2, "B");

		e.agregarVivienda(v1);
		e.agregarVivienda(v2);
	
		Persona2 p1 = new Persona2("Monica", "Gaztambide", 35);
		Persona2 p2 = new Persona2("Arturo", "Roman", 53);
		
		v1.agregarPersona(p1);
		v1.agregarPersona(p2);
		
		Mueble m1 = new Mueble("Mesa", "Madera", "Marron");
		Mueble m2 = new Mueble("Mesada", "Marmol", "Rojo");
		Mueble m3 = new Mueble("Perchero", "Metal", "Negro");
		Mueble m4 = new Mueble("Sillon", "Cuero", "Azul");
		
		v1.agregarMueble(m1);
		v1.agregarMueble(m2);
		v1.agregarMueble(m3);
		v1.agregarMueble(m4);
		
		e.mostrarTodo();
		System.out.println();
		
		e.realizarMudanza(v1, v2);
	
		e.mostrarTodo();

	}
}
