package ar.edu.ort.tp1.tp2Ejercicio02;

import ar.edu.ort.tp1.tp2Ejercicio01.NumeroTelefonico;
import ar.edu.ort.tp1.tp2Ejercicio01.Persona;
import ar.edu.ort.tp1.tp2Ejercicio01.TipoLinea;

public class TestEjercicio02 {

	public static void main(String[] args) {
		Persona persona = new Persona("Lionel", "Messi");
		NumeroTelefonico numero = new NumeroTelefonico(114111, 2222, 549, TipoLinea.CELULAR);
		NumeroTelefonico numero2 = new NumeroTelefonico(32444, 5678, 68, TipoLinea.CELULAR);
		NumeroTelefonico numero3 = new NumeroTelefonico(4411, 5472, 54, TipoLinea.FIJO);
		persona.agregarNumeroTelefonico(numero);
		persona.agregarNumeroTelefonico(numero2);
		persona.agregarNumeroTelefonico(numero3);
	
		
		persona.agregarEmail("lio@messi.com");
		persona.agregarEmail("liomessi_newells@hotmail.com");
		
		persona.agregarMascota(new Mascota("Pluto", "Perro"));
		persona.agregarMascota(new Mascota("Felix", "Gato"));
		persona.agregarMascota(new Mascota("Bugs", "Conejo"));
		
		persona.mostrarTodoConMascota();
	}
}
