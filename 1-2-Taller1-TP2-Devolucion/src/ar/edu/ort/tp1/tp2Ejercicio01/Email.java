package ar.edu.ort.tp1.tp2Ejercicio01;

public class Email {
	private String identificador;
	private String dominio;

	public Email(String email) {
		String[] mail;
		mail = email.split("@");
		identificador = mail[0];
		dominio = mail[1];
	}

	public String getDireccion() {
		return identificador + "@" + dominio;
	}
}