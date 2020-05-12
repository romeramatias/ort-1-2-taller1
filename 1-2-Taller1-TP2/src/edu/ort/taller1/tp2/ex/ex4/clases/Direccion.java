package edu.ort.taller1.tp2.ex.ex4.clases;

public class Direccion {

	private String calle;
	private int altura;
	private int piso;
	private String departamento;
	
	public Direccion(String calle, int altura, int piso, String departamento) {
		super();
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", altura=" + altura + ", piso=" + piso + ", departamento=" + departamento
				+ "]";
	}
	
	public void mostrar() {
		System.out.println("Direccion: " + this.calle + " " + this.altura + " " + this.piso + " " + this.departamento);
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
}
