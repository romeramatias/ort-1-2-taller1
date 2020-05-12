package edu.ort.taller1.tp2.ex.ex2.clases;

import java.util.ArrayList;

import edu.ort.taller1.tp2.ex.ex1.clases.Persona;

public class PersonaConMascota extends Persona {

	private ArrayList<Mascota> mascotas;

	public PersonaConMascota(String nombre, String apellido) {
		super(nombre, apellido);
		this.mascotas = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "PersonaConMascota [mascotas=" + mascotas + "]";
	}
	
	public void mostrarTodo() {
		super.mostrarTodo();
		this.mostrarMascota();
	}
	
	public void mostrarMascota() {
		if (this.mascotas.size() > 0) {
			System.out.println("Mascotas:");
			for (Mascota m : this.mascotas) {
				System.out.println(m.getTipo() + ", " + m.getNombre());
			}
		}
	}

	public void agregarMascota(Mascota m) {
		// Agregacion ya que una mascota puede ser de mas de un objeto PersonaConMascota
		this.mascotas.add(m);
	}
	
	public void eliminarMascota(int i) {
		this.mascotas.remove(i);
	}

	public void limpiarListaMascotas() {
		this.mascotas.clear();;
	}

	
	public ArrayList<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(ArrayList<Mascota> mascotas) {
		this.mascotas = mascotas;
	}
	
	
	
}
