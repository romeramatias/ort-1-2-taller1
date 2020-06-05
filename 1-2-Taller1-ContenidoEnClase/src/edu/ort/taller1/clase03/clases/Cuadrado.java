package edu.ort.taller1.clase03.clases;

public class Cuadrado extends Poligono{

	private double base;
	
	public Cuadrado(String color, double base) {
		super("Cuadrado", color);
		this.base = base;
	}
	
	public double calcularArea() {
		return base * base;
	}
	
	public void mostrar(){
		String cartel;
		cartel = "Soy un " + this.getNombre() + " de color: " + getColor() + " y mi area es: " + this.calcularArea();
		System.out.println(cartel);
	}
	
	public void unMetodoEspecial() {
		System.out.println("Soy un metodo cuadrado");
	}
}
