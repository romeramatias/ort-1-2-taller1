package edu.ort.taller1.tp2.ex;

import edu.ort.taller1.tp2.ex.ex1.clases.NumeroTelefonico;
import edu.ort.taller1.tp2.ex.ex1.clases.TipoDeLinea;
import edu.ort.taller1.tp2.ex.ex2.clases.Mascota;
import edu.ort.taller1.tp2.ex.ex2.clases.PersonaConMascota;

public class Ex2 {

	public static void main(String[] args) {
		
		PersonaConMascota p2 = new PersonaConMascota("Lionel", "Messi");
		NumeroTelefonico n1 = new NumeroTelefonico(114111, 2222, 549, TipoDeLinea.CELULAR);
		NumeroTelefonico n2 = new NumeroTelefonico(032444, 5678, 68, TipoDeLinea.CELULAR);
		NumeroTelefonico n3 = new NumeroTelefonico(4411, 5472, 054, TipoDeLinea.FIJO);
		
		p2.agregarTelefono(n1);
		p2.agregarTelefono(n2);
		p2.agregarTelefono(n3);		
		
		p2.agregarEmail("lio@messi.com");
		p2.agregarEmail("liomessi_newells@hotmail.com");
		
		
		Mascota m1 = new Mascota("Pluto", "Perro");
		Mascota m2 = new Mascota("Felix", "Gato");
		Mascota m3 = new Mascota("Bugs", "Conejo");

		p2.agregarMascota(m1);
		p2.agregarMascota(m2);
		p2.agregarMascota(m3);
		
		p2.mostrarTodo();
	}

}
