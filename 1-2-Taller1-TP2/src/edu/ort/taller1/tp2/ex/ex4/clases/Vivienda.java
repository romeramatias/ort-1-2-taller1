package edu.ort.taller1.tp2.ex.ex4.clases;

import java.util.ArrayList;

public class Vivienda {

	private Direccion direccion;
	private ArrayList<Persona2> personas;
	private ArrayList<Mueble> muebles;
	
	public Vivienda(String calle, int altura, int piso, String departamento) {
		this.direccion = new Direccion(calle, altura, piso, departamento);
		this.personas = new ArrayList<>();
		this.muebles = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Vivienda [direccion=" + direccion + ", personas=" + personas + ", muebles=" + muebles + "]";
	}
	
	public void mostrarTodo() {
		mostrarDireccion();
		mostrarPersonas();
		mostrarMuebles();
	}
	
	private void mostrarDireccion() {
		direccion.mostrar();
	}
	
	private void mostrarPersonas() {
		if (this.personas.size() > 0) {
			System.out.println("Personas:");
			for (Persona2 p : this.personas) {
				p.mostrar();
			}
		} else {
			System.out.println("Vivienda sin personas");
		}
	}
	
	private void mostrarMuebles() {
		if (this.muebles.size() > 0) {
			System.out.println("Muebles:");
			for (Mueble m : this.muebles) {
				m.mostrar();
			}
		} else {
			System.out.println("Vivienda sin muebles");
		}
	}
	
	public void agregarPersona(Persona2 p) {
		this.personas.add(p);
	}
	
	public void agregarMueble(Mueble m) {
		this.muebles.add(m);
	}
	
	public void eliminarPersona(int i) {
		this.personas.remove(i);
	}
	
	public void eliminarMueble(int i) {
		this.muebles.remove(i);
	}
	
	public void limpiarTodo() {
		this.limpiarMuebles();
		this.limpiarPersonas();
	}
	
	public void limpiarMuebles() {
		this.muebles.clear();
	}
	
	public void limpiarPersonas() {
		this.personas.clear();
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Persona2> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona2> personas) {
		this.personas = personas;
	}

	public ArrayList<Mueble> getMuebles() {
		return muebles;
	}

	public void setMuebles(ArrayList<Mueble> muebles) {
		this.muebles = muebles;
	}
	
	
	
	
}
