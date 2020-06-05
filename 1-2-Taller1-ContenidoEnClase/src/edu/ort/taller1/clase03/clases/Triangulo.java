package edu.ort.taller1.clase03.clases;

public class Triangulo extends Poligono{

	public double base;
	public double altura;

	public Triangulo(String color, double base, double altura) {
		super("Triangulo", color);	
		this.base = base;
		this.altura = altura;
	}
	
	public boolean equals(Object o) {
		// Override del metodo equals
		// Vamos a reescribirlo y definir que un triangulo es igual 
		// a otro triangulo cuando tienen el mismo color
		
		// Me aseguro de que no estemos comparando el mismo objeto
		// en ese caso serian iguales
		if(o == this) {
			return true;
		}
		
		// Chequeamos si el objeto que nos mandan es una instancia de triangulo
		// si no lo es, no son iguales
		if(!(o instanceof Triangulo)) {
			return false;
		}
		
		// Si llegamos a este punto y el metodo no finalizo con ningun return
		// se asume que el objeto que nos pasan es un Triangulo
		// Para comparar si es igual lo casteamos al tipo de dato Triangulo
		// obtenemos su color y lo comparamos con this
		return this.getColor().equals(((Triangulo)o).getColor());		
		
	}
	
	// Indica que un metodo no se v a utilizar mas
	@Deprecated
	public void unMetodoEspecial() {
		System.out.println("Soy un metodo triangulo");
	}
	
	public double calcularArea() {
		return base * altura / 2;
	}
	
	public void mostrar() {
		// Sobreescritura de metodo
		// Segun entiendo los metodos se heredan siempre que sean publicos
		// Es como que se ejecutan desde la clase heredada
		String cartel;
		cartel = "Soy un " + this.getNombre() + " de color: " + getColor() + " y mi area es: " + this.calcularArea();
		System.out.println(cartel);
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
