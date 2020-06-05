package ar.edu.ort.tp1.tp2Ejercicio01;

public class NumeroTelefonico {
	private int caracteristica;
	private int numeroDeAbonado;
	private int codigoPais;
	private TipoLinea tipoLinea;
	
	public NumeroTelefonico(){
		caracteristica=0;
		numeroDeAbonado=0;
		codigoPais=0;
		tipoLinea=null;
	}
	public NumeroTelefonico(int caracteristica, int numeroDeAbonado, int codigoPais, TipoLinea tipoLinea){
		this.caracteristica=caracteristica;
		this.numeroDeAbonado=numeroDeAbonado;
		this.codigoPais=codigoPais;
		this.tipoLinea=tipoLinea;
	}
	public void setCaracteristica(int caracteristica ){
		this.caracteristica=caracteristica;
	}
	public int getCaracteristica(){
		return caracteristica;
	}
	public void setnumeroDeAbonado(int numeroDeAbonado){
		this.numeroDeAbonado=numeroDeAbonado;
	}
	public int getnumeroDeAbonado(){
		return numeroDeAbonado;
	}
	public void setcodigoPais(int codigoPais){
		this.codigoPais=codigoPais;
	}
	public int getcodigoPais(){
		return codigoPais;
	}
	public void settipoLinea(TipoLinea tipoLinea){
		this.tipoLinea=tipoLinea;
	}
	public TipoLinea gettipoLinea(){
		return tipoLinea;
	}
	public String getNumero(){
		return "(+" + codigoPais +") " + caracteristica + "-" + numeroDeAbonado;
	}
}