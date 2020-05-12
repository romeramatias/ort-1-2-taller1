package edu.ort.taller1.tp2.ex;

import edu.ort.taller1.tp2.ex.ex4.clases.Mueble;
import edu.ort.taller1.tp2.ex.ex4.clases.Persona2;
import edu.ort.taller1.tp2.ex.ex4.clases.Vivienda;

public class Ex4 {

	public static void main(String[] args) {

		Vivienda v = new Vivienda("Montañeses", 1234, 4, "C");
		
		Persona2 p1 = new Persona2("Monica", "Gaztambide", 35);
		Persona2 p2 = new Persona2("Arturo", "Roman", 53);

		Mueble m1 = new Mueble("Mesa", "Madera", "Marron");
		Mueble m2 = new Mueble("Mesada", "Marmol", "Rojo");
		Mueble m3 = new Mueble("Perchero", "Metal", "Negro");
		Mueble m4 = new Mueble("Sillon", "Cuero", "Azul");

		v.agregarPersona(p1);
		v.agregarPersona(p2);
		v.agregarMueble(m1);
		v.agregarMueble(m2);
		v.agregarMueble(m3);
		v.agregarMueble(m4);
		
		v.mostrarTodo();
		
	}

}
