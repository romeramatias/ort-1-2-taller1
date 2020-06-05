package ar.edu.ort.tp1.tp2Ejercicio04;

import java.util.ArrayList;

public class Vivienda {
	private Direccion direccion;
	private ArrayList<Persona> listPersonas;
	private ArrayList<Mueble> listMuebles;
	
	public void setDireccion (String calle, int altura, String piso, String departamento){
		this.direccion = new Direccion(calle, altura, piso, departamento);
		listPersonas = new ArrayList<Persona>();
		listMuebles = new ArrayList<Mueble>();
	}	
	
	public Direccion getDireccion(){
		return this.direccion;
	}
	public void agregarPersona(Persona persona){
		listPersonas.add(persona);
	}
	
	public void agregarMueble(Mueble mueble){
		listMuebles.add(mueble);
	}	
	
	public void mostrar(){
		System.out.println("Direccion: "+ this.getDireccion().mostrar());
		System.out.println("Personas:");
		
		for (int i=0; i<listPersonas.size();i++){
			System.out.println(listPersonas.get(i).mostrar());
		}
		
		System.out.println("Muebles:");
		for (int j=0; j<listMuebles.size();j++){
			System.out.println(listMuebles.get(j).mostrar());
		}		
	}
	
	public ArrayList<Persona> getListaPersonas(){
		return listPersonas;
	}
	
	public ArrayList<Mueble> getListaMuebles(){
		return listMuebles;
	}
	
	public void vaciarListas(){
		listPersonas.clear();
		listMuebles.clear();
	}
}
