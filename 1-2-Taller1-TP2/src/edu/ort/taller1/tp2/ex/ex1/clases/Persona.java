package edu.ort.taller1.tp2.ex.ex1.clases;

import java.util.ArrayList;

import edu.ort.taller1.tp2.ex.ex3.clases.Hito;

public class Persona {


	private String nombre;
	private String apellido;
	private ArrayList<Email> emails;
	private ArrayList<NumeroTelefonico> numeros;
	// EXTENSION EJ 3
	private ArrayList<Hito> hitos;

	public Persona() {
		this(null, null);
	}

	public Persona(String nombre, String apellido) {
		// En este caso no aplica, pero por una cuestion de validaciones siempre va a
		// ser mejor
		// usar los setters para asignar los valores.
		// Ejemplo si fuese edad, estaria validado en el setter una edad minima o maxima
		setNombre(nombre);
		setApellido(apellido);
		this.emails = new ArrayList<>();
		this.numeros = new ArrayList<>();
		// EJ 3
		this.hitos = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", emails=" + emails + ", numeros=" + numeros
				+ "]";
	}

	public void mostrarTodo() {
		System.out.println(this.nombre + ", " + this.apellido);
		this.mostrarTelefonos();
		this.mostarEmails();
	}
	
	public void mostrarTelefonos() {
		if (this.numeros.size() > 0) {
			System.out.println("Telefonos:");
			for (NumeroTelefonico n : this.numeros) {
				System.out.println(n.getTipoLinea() + ": " + n.getValor());
			}
		}
	}

	public void mostarEmails() {
		if (this.emails.size() > 0) {
			System.out.println("Emails:");
			for (Email e : this.emails) {
				System.out.println(e.getValor());
			}
		}
	}

	public void agregarTelefono(NumeroTelefonico n) {
		this.numeros.add(n);
	}

	public void agregarEmail(String email) {
		// Composicion, creo el objeto dentro de la clase
		// Si el objeto Persona deja de existir, Email tambien
		Email e = new Email(email);
		this.emails.add(e);
	}
	
	public void agregarHito(Hito h) {
		this.hitos.add(h);
	}

	public void eliminarTelefono(int i) {
		this.numeros.remove(i);
	}

	public void eliminarMail(int i) {
		this.emails.remove(i);
	}

	public void limpiarListaTelefonos() {
		this.numeros.clear();
	}
	
	public void limpiarListaMails() {
		this.emails.clear();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public ArrayList<Email> getEmails() {
		return emails;
	}

	public void setEmails(ArrayList<Email> emails) {
		this.emails = emails;
	}

	public ArrayList<NumeroTelefonico> getNumeros() {
		return numeros;
	}

	public void setNumeros(ArrayList<NumeroTelefonico> numeros) {
		this.numeros = numeros;
	}

	public ArrayList<Hito> getHitos() {
		return hitos;
	}

	public void setHitos(ArrayList<Hito> hitos) {
		this.hitos = hitos;
	}

	
}
