package edu.ort.taller1.clase02;

import edu.ort.taller1.clase02.clases.*;

public class Main02 {

	public static void main(String[] args) {
		Estacionamiento e = new Estacionamiento(4, 22);
		System.out.println(e);
		
		Automovil[][] a = e.getMatrizEspacios();
		
		for (int f = 0; f < a.length; f++) {
			for (int c = 0; c < a[f].length; c++) {
				System.out.print(a[f][c] + " ");
			}
			System.out.println();
		}
		Automovil a1 = new Automovil(TipoVehiculo.COMUN);

		System.out.println(e.estaOcupado(0, 4));
		System.out.println(e.cantidadDisponible());
		e.ocuparEspacio(0, 4, a1);
		System.out.println(e.recaudarHoy());
		System.out.println(e.recaudarPasillo(0));
		System.out.println(e.cuantosAutosHayEnLaPosicion(4));
		
		
		
		
		e.inicializarEstacionamiento();
		System.out.println();
		
		for (int f = 0; f < a.length; f++) {
			for (int c = 0; c < a[f].length; c++) {
				System.out.print(a[f][c] + " ");
			}
			System.out.println();
		}
		
		System.out.println(e.estaOcupado(0, 4));
		System.out.println(e.cantidadDisponible());
		System.out.println(e.recaudarHoy());
		
		e.ocuparEspacio(0, 4, a1);
	
	}
}
