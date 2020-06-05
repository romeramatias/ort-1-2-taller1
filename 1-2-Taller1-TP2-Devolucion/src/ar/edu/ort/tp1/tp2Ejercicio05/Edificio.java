package ar.edu.ort.tp1.tp2Ejercicio05;

import java.util.ArrayList;

import ar.edu.ort.tp1.tp2Ejercicio04.Mueble;
import ar.edu.ort.tp1.tp2Ejercicio04.Persona;
import ar.edu.ort.tp1.tp2Ejercicio04.Vivienda;

public class Edificio {
	private String calle;
	private String altura;
	private ArrayList<Vivienda> listViviendas = new ArrayList<Vivienda>();
	
	public Edificio(String calle, String altura){
		this.calle = calle;
		this.altura = altura;
	}
	
	public Edificio(){
		this.calle = "sin calle";
		this.altura = "sin altura";
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	
	public void agregarVivienda(Vivienda vivienda){
		listViviendas.add(vivienda);
	}
	
	public void realizarMudanza(Vivienda origen, Vivienda destino){
		Persona persona;
		for (int i=0; i<origen.getListaPersonas().size();i++){
			persona = origen.getListaPersonas().get(i);
			destino.agregarPersona(persona);
		}
		
		Mueble mueble;
		for (int j=0; j<origen.getListaMuebles().size();j++){
			mueble = origen.getListaMuebles().get(j);
			destino.agregarMueble(mueble);
		}
		origen.vaciarListas();		
	}
	
	public void mostrar(){
		Vivienda vivienda;
		//System.out.println("Listado de viviendas del edificio de la calle "+ getCalle() + " "+ getAltura());
		for (int i= 0; i<listViviendas.size();i++){
			System.out.println("Vivienda "+(i+1)+":");
			vivienda = listViviendas.get(i);
			vivienda.mostrar();
		}			
	}
}