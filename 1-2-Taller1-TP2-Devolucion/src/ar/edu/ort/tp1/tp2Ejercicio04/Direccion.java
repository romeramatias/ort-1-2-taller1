package ar.edu.ort.tp1.tp2Ejercicio04;

public class Direccion {
	private String calle;
	private int altura;
	private String piso;
	private String departamento;
	
	public Direccion (){
		this.calle = "sin calle";
		this.altura = 0;
		this.piso = "sin piso";
		this.departamento = "sin departament";
	}
	
	public Direccion (String calle, int altura, String piso, String departamento){
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.departamento = departamento;
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
	public String getPiso() {
		return piso;
	}
	public void setPiso(String piso) {
		this.piso = piso;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String mostrar(){
		String salida = "";
		salida = this.getCalle()+ " " + this.getAltura();
		
		if (this.getPiso().length()>0){
			salida += " " +this.getPiso()+"°";
		}
		
		if (this.getDepartamento().length()>0){
			salida += '"'+ this.getDepartamento()+'"';
		}
		return  salida;
	}	
}
