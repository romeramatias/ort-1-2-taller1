package edu.ort.taller1.tp1.ex;

import edu.ort.taller1.tp1.ex.ex4y5.clases.Anio;

public class Ex4y5 {

	public static void main(String[] args) {

		// Creamos una instancia de Anio
		Anio dosMilVeinte = new Anio();
		
		// Get del nombre de mes enviando un numero
		System.out.println(dosMilVeinte.getNombreDelMes(1));
		System.out.println();
		
		// Consulta de dias transcurridos enviando numero de mes
		System.out.println(dosMilVeinte.diasTranscurridos(2));
		System.out.println();
		
		// Consulta de dias transcurridos enviando mes y dia
		System.out.println(dosMilVeinte.diasTranscurridos(22, 3));
		
	}

}
