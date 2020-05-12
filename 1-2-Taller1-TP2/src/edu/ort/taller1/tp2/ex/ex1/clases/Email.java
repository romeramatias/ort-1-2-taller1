package edu.ort.taller1.tp2.ex.ex1.clases;

public class Email {

	private String cuenta;
	private String dominio;
	
	public Email() {
		this(null);
	}
	
	public Email(String email) {
		String[] mail;
		// Busca las arrobas y separa el contenido en un Array de tantos elementos como este separador haya
		mail = email.split("@");
		// email.replace("@", ""); Este metodo reemplaza los caracteres seleccionados por el nuevo elegido
		// El metodo split sirve para los archivos CSV (coma separated value)
		// limite de caracteres para un email es 320
		this.cuenta = mail[0];
		this.dominio = mail[1];
	}

	@Override
	public String toString() {
		return "Email [cuenta=" + cuenta + ", dominio=" + dominio + "]";
	}

	public String getValor() {
		return this.cuenta + "@" + this.dominio;
	}
	
	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	
}
