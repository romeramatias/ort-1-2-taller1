package edu.ort.taller1.tp2.ex.ex1.clases;

public class NumeroTelefonico {

	private int caracteristica;
	private int numeroAbonado;
	private int codigoPais;
	private Enum<TipoDeLinea> tipoLinea;
	
	public NumeroTelefonico() {
		this(0,0,0,null);
	}
	
	public NumeroTelefonico(int caracteristica, int numeroAbonado, int codigoPais, Enum<TipoDeLinea> tipoLinea) {
		super();
		this.caracteristica = caracteristica;
		this.numeroAbonado = numeroAbonado;
		this.codigoPais = codigoPais;
		this.tipoLinea = tipoLinea;
	}

	@Override
	public String toString() {
		return "NumeroTelefonico [caracteristica=" + caracteristica + ", numeroAbonado=" + numeroAbonado
				+ ", codigoPais=" + codigoPais + ", tipoLinea=" + tipoLinea + "]";
	}
	
	public String getValor() {
		return "(+" + this.codigoPais + ") " + this.caracteristica + "-" + this.numeroAbonado;
	}

	public int getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(int caracteristica) {
		this.caracteristica = caracteristica;
	}

	public int getNumeroAbonado() {
		return numeroAbonado;
	}

	public void setNumeroAbonado(int numeroAbonado) {
		this.numeroAbonado = numeroAbonado;
	}

	public int getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(int codigoPais) {
		this.codigoPais = codigoPais;
	}

	public Enum<TipoDeLinea> getTipoLinea() {
		return tipoLinea;
	}

	public void setTipoLinea(Enum<TipoDeLinea> tipoLinea) {
		this.tipoLinea = tipoLinea;
	}
	
	
}
