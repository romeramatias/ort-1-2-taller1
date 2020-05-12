package edu.ort.taller1.tp2.ex.ex4.clases;

public class Persona2 {

	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona2(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona2 [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

	public void mostrar() {
		System.out.print("Nombre: " + this.nombre + " " + this.apellido + " ");
		System.out.println("Edad: " + this.edad);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
