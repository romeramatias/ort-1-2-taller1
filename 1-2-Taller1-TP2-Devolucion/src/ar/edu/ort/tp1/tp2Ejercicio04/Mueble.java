package ar.edu.ort.tp1.tp2Ejercicio04;

public class Mueble {
	private String nombre;
	private String color;
	private String material;
	
	public Mueble (){
		this.nombre = "sin nombre";
		this.color = "sin color";
		this.material = "sin material";
	}
	public Mueble (String nombre, String color, String material){
		this.nombre = nombre;
		this.color = color;
		this.material = material;
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String mostrar(){
		return nombre+" de "+ material+ " color " + color;
	}
}
