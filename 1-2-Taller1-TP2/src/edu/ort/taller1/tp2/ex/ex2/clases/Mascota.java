package edu.ort.taller1.tp2.ex.ex2.clases;

public class Mascota {

	private String nombre;
	private String tipo;
	
	
	public Mascota() {
		this("Unnamed", "Unnamed");
	}

	public Mascota(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", tipo=" + tipo + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
