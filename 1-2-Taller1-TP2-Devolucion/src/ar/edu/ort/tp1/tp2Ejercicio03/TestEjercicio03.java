package ar.edu.ort.tp1.tp2Ejercicio03;

import ar.edu.ort.tp1.tp2Ejercicio01.NumeroTelefonico;
import ar.edu.ort.tp1.tp2Ejercicio01.Persona;
import ar.edu.ort.tp1.tp2Ejercicio01.TipoLinea;
import ar.edu.ort.tp1.tp2Ejercicio02.Mascota;

public class TestEjercicio03 {

	public static void main(String[] args) {
		Persona persona = new Persona("Lionel", "Messi");
		Persona persona2 = new Persona("Antonella", "Rocuzzo");
		
		NumeroTelefonico numero = new NumeroTelefonico(114111, 2222, 549, TipoLinea.CELULAR);
		NumeroTelefonico numero2 = new NumeroTelefonico(32444, 5678, 68, TipoLinea.CELULAR);
		NumeroTelefonico numero3 = new NumeroTelefonico(4411, 5472, 54, TipoLinea.FIJO);
		persona.agregarNumeroTelefonico(numero);
		persona.agregarNumeroTelefonico(numero2);
		persona.agregarNumeroTelefonico(numero3);
		
		persona2.agregarNumeroTelefonico(numero3);
		
		persona.agregarEmail("lio@messi.com");
		persona2.agregarEmail("anto_rocuzzo@hotmail.com");
		
		persona.agregarMascota(new Mascota("Pluto", "Perro"));
		persona.agregarMascota(new Mascota("Felix", "Gato"));
		persona.agregarMascota(new Mascota("Bugs", "Conejo"));
		
		Hito hito = new Hito("20/12/2016", "Casamiento");
		hito.agregarPersona(persona);
		hito.agregarPersona(persona2);
		
		hito.mostrarTodo();		
	}
}