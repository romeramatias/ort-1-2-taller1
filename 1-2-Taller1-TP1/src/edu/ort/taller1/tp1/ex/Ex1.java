package edu.ort.taller1.tp1.ex;

import edu.ort.taller1.tp1.ex.ex1.clases.*;

public class Ex1 {

	public static void main(String[] args) {
		
		// Constructor
		Grupo grupo = new Grupo("ORT");
		
		// Getter del nombre del grupo
		System.out.println(grupo.getStringNombreGrupo());
		System.out.println();
	
		// Setter del nombre del grupo
		grupo.setStringNombreGrupo("ORT Grupo");
		
		// Metodo de agregar integrantes validado
		grupo.agregarIntegrante("Matias");
		grupo.agregarIntegrante("Pablo");
		grupo.agregarIntegrante("Carlos");
		grupo.agregarIntegrante("Nir");
		grupo.agregarIntegrante("Alejandro");
		
		// Vuelvo a agregar un integrante existente 
		grupo.agregarIntegrante("Matias");
		System.out.println();
		
		// Metodo para ver la cantidad de integrantes
		System.out.println("Cantidad de integrantes en el grupo: " + grupo.getCantidadIntegrantes());
		System.out.println();
		
		// Metodo de obtener la posicion de un nombre del ArrayList
		System.out.println("Posicion en el ArrayList del integrante Nir: " + grupo.obtenerPosicionIntegrante("Nir"));
		System.out.println();
		
		// Metodo de retorno de nombre de un integrante segun posicion en el ArrayList
		System.out.println(grupo.obtenerIntegrante(1));
		System.out.println();
		
		// Metodo de remover integrante
		grupo.removerIntegrante("Nir");
		System.out.println();
		
		// Metodo de mostar integrantes
		grupo.mostrarIntegrantes();
		
		// Metodo mostrar
		grupo.mostrar();
		
		// Metodo vaciar
		grupo.vaciar();

	}

}
