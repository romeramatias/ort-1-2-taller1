package edu.ort.taller1.tp2.ex.ex4.clases;

public class Mueble {

	private String nombre;
	private String material;
	private String color;
	
	public Mueble(String nombre, String material, String color) {
		super();
		this.nombre = nombre;
		this.material = material;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Mueble [nombre=" + nombre + ", material=" + material + ", color=" + color + "]";
	}
	
	public void mostrar() {
		System.out.println(this.nombre + " de " + this.material + " color " + this.color);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
