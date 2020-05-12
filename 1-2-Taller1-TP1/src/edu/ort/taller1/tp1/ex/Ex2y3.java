package edu.ort.taller1.tp1.ex;

import edu.ort.taller1.tp1.ex.ex2y3.clases.*;;

public class Ex2y3 {

	public static void main(String[] args) {
		
		// Creo una instancia de Carrera
		Carrera cienMetros = new Carrera("Cien Metros");
		
		// Asigno atletas a la carrera con su respectivo tiempo
		cienMetros.agregarAtleta("Bolt", 9.69);
		cienMetros.agregarAtleta("Thompson", 9.89);
		cienMetros.agregarAtleta("Dix", 9.91);
		cienMetros.agregarAtleta("Martina", 9.93);
		cienMetros.agregarAtleta("Powell", 9.95);
		cienMetros.agregarAtleta("Fratter", 9.97);
		// Lo agrego dos veces para ver si funciona la validacion
		cienMetros.agregarAtleta("Fratter", 9.97);
		System.out.println();
		
		// Calculo el ganador de la carrera
		cienMetros.ganadorCarrera2();
		System.out.println();

		// Calculo el podio de la carrera
		cienMetros.podio();
		
	}

}
