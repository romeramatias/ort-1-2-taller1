package ar.edu.ort.tp1.tp2Ejercicio03;

import java.util.ArrayList;
import ar.edu.ort.tp1.tp2Ejercicio01.Persona;

public class Hito {
	private String fecha;
	private String descripcion;
	private ArrayList<Persona> listPersonas;
	
	public Hito (String fecha, String descripcion){
		this.fecha = fecha;
		this.descripcion = descripcion;		
		listPersonas = new ArrayList<Persona>();
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void agregarPersona (Persona persona){
		listPersonas.add(persona);
	}
	
	public void mostrarTodo(){
		System.out.println("Fecha: "+getFecha());
		System.out.println("descripcion: "+getDescripcion());
		
		Persona persona;
		for(int i=0; i<listPersonas.size();i++){
			persona = listPersonas.get(i);
			persona.mostrarTodoConMascota();
		}		
	}	
}
