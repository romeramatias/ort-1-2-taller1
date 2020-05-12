package edu.ort.taller1.tp1.ex.ex2y3.clases;

public class Atleta {

	private String nombre;
	private Double segundos;
	
	public Atleta(String nombre, Double segundos) {
		super();
		this.nombre = nombre;
		this.segundos = segundos;
	}

	@Override
	public String toString() {
		return "Atleta [nombre=" + nombre + ", segundos=" + segundos + "]";
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSegundos() {
		return segundos;
	}

	public void setSegundos(Double segundos) {
		this.segundos = segundos;
	}
	
	
	
}
