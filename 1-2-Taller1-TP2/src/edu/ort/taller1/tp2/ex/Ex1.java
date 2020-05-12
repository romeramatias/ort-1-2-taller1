package edu.ort.taller1.tp2.ex;

import edu.ort.taller1.tp2.ex.ex1.clases.NumeroTelefonico;
import edu.ort.taller1.tp2.ex.ex1.clases.Persona;
import edu.ort.taller1.tp2.ex.ex1.clases.TipoDeLinea;

public class Ex1 {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Matias", "Romera");
		
		// Instanciamos numeros telefonicos, agregacion
		NumeroTelefonico n1 = new NumeroTelefonico(11, 36778585, 54, TipoDeLinea.CELULAR);
		NumeroTelefonico n2 = new NumeroTelefonico(11, 44556677, 54, TipoDeLinea.FIJO);
		NumeroTelefonico n3 = new NumeroTelefonico(11, 22339988, 54, TipoDeLinea.FAX);

		p1.agregarTelefono(n1);
		p1.agregarTelefono(n2);
		p1.agregarTelefono(n3);
		
		// Utilizamos composicion para agregar mail
		p1.agregarEmail("romeramatias0@gmail.com");
		
		// Mostramos Persona con sus datos
		p1.mostrarTodo();
	}

}
