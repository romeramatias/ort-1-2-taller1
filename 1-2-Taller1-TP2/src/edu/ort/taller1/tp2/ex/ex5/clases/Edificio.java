package edu.ort.taller1.tp2.ex.ex5.clases;

import java.util.ArrayList;

import edu.ort.taller1.tp2.ex.ex4.clases.Mueble;
import edu.ort.taller1.tp2.ex.ex4.clases.Persona2;
import edu.ort.taller1.tp2.ex.ex4.clases.Vivienda;

public class Edificio {

	public String calle;
	public int altura;
	private ArrayList<Vivienda> viviendas;

	public Edificio(String calle, int altura) {
		this.calle = calle;
		this.altura = altura;
		this.viviendas = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Edificio [viviendas=" + viviendas + "]";
	}

	public void realizarMudanza(Vivienda origen, Vivienda destino) {
		ArrayList<Persona2> p = origen.getPersonas();
		ArrayList<Mueble> m = origen.getMuebles();
		
		for (int i = 0; i < p.size(); i++) {
			destino.agregarPersona(p.get(i));
		}
		
		for (int i = 0; i < m.size(); i++) {
			destino.agregarMueble(m.get(i));
		}
		
		origen.limpiarTodo();
		System.out.println("Mudanza realizada correctamente");
	}
	
	public void agregarVivienda(Vivienda v) {
		this.viviendas.add(v);
	}
	
	public void mostrarTodo() {
		this.mostrarViviendas();
	}
	
	public void mostrarViviendas() {
		if (this.viviendas.size() > 0) {
			for (int i = 0; i < viviendas.size(); i++) {
				System.out.println("Vivienda " + (i+1) + ":"); // Porque siempre imprime 1???
				this.viviendas.get(i).mostrarTodo();
				}
			
		}
	}
	
	// Asi lo quise hacer y no me salio
	public void agregarVivienda2(int piso, String departamento) {
		Vivienda v = new Vivienda(this.calle, this.altura, piso, departamento);
		this.viviendas.add(v);
	}
	
	public ArrayList<Vivienda> getViviendas() {
		return viviendas;
	}

	public void setViviendas(ArrayList<Vivienda> viviendas) {
		this.viviendas = viviendas;
	}
	
	
	
	
}
