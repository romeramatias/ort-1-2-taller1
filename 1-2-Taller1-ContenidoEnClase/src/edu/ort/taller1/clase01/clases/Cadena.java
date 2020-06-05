package edu.ort.taller1.clase01.clases;

import java.util.ArrayList;

public class Cadena {
	
	ArrayList<String> nombresList;
	
	
	public void agregarNombre(String nombre) {
		nombresList.add(nombre);
	}


	public Cadena() {
		super();
		this.nombresList = new ArrayList<>();
	}

	public Integer obtenerCantidadNombres(String letra) {
		Integer intCantidadNombre = 0;
		String stringCadenaActual;
		
		for (int i = 0; i < nombresList.size(); i++) {
			stringCadenaActual = nombresList.get(i);
			if(stringCadenaActual.toLowerCase().contains(letra.toLowerCase())) {
				intCantidadNombre++;
			}
		}
		
		return intCantidadNombre;
	}
	
	
	
	
}
