package edu.ort.taller1.clase03.clases;

public class Poligono {

	private String nombre;
	private String color;
	
	public void mostrar(){
		String cartel;
		cartel = "Soy un " + this.nombre + " de color: " + this.color + " y mi area es " + calcularArea();
		System.out.println(cartel);
	}
	public double calcularArea() {
		return 0;
	}
	
	public Poligono(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}		
	
}
