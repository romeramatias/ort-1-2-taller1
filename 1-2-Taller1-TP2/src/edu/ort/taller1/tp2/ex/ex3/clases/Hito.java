package edu.ort.taller1.tp2.ex.ex3.clases;

import java.util.ArrayList;

import edu.ort.taller1.tp2.ex.ex1.clases.Persona;
import edu.ort.taller1.tp2.ex.ex2.clases.PersonaConMascota;

public class Hito {

	private String fecha;
	private String descripcion;
	private ArrayList<Persona> personasInvolucradas;

	public Hito() {
		this(null, null);
	}

	public Hito(String fecha, String descripcion) {
		super();
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.personasInvolucradas = new ArrayList<>();
	}

	public void agregarPersonas(Persona p) {
		// Agregacion, el hito puede se de mas de una persona
		this.personasInvolucradas.add(p);
	}
	
	public void agregarPersonas(PersonaConMascota p) {
		// Agregacion, el hito puede se de mas de una persona
		this.personasInvolucradas.add(p);
	}

	@Override
	public String toString() {
		return "Hito [fecha=" + fecha + ", descripcion=" + descripcion + ", personasInvolucradas="
				+ personasInvolucradas + "]";
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ArrayList<Persona> getPersonasInvolucradas() {
		return personasInvolucradas;
	}

	public void setPersonasInvolucradas(ArrayList<Persona> personasInvolucradas) {
		this.personasInvolucradas = personasInvolucradas;
	}

	public void mostrarTodo() {
		System.out.println("Fecha: " + getFecha());
		System.out.println("descripcion: " + getDescripcion());

		Persona persona;
		for (int i = 0; i < personasInvolucradas.size(); i++) {
			persona = personasInvolucradas.get(i);
			persona.mostrarTodo();
		}

	}
}
