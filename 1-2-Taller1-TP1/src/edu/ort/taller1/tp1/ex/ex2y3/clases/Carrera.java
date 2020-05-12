package edu.ort.taller1.tp1.ex.ex2y3.clases;

import java.util.ArrayList;

public class Carrera {

	String nombreCarrera;
	private ArrayList<Atleta> atletasList;

	public void agregarAtleta(String nombreAtleta, double segundos) {
		Atleta nombreEncontrado = null;
		nombreEncontrado = buscarAtleta(nombreAtleta);
		String nombreCarrera = getNombreCarrera();

		if (nombreEncontrado == null) {
			Atleta atleta = new Atleta(nombreAtleta, segundos);
			atletasList.add(atleta);
			System.out.println(nombreAtleta + " fue asignado a la carrera de " + nombreCarrera);
		} else {
			System.out.println(nombreAtleta + ": atleta existente");
		}
	}

	private Atleta buscarAtleta(String nombreAtleta) {
		Atleta aEncontrado = null;
		Atleta auxiliar;
		int index = 0;
		while (aEncontrado == null && index < this.atletasList.size()) {
			auxiliar = this.atletasList.get(index);
			if (auxiliar.getNombre().equals(nombreAtleta)) {
				aEncontrado = auxiliar;
			}
			index++;
		}
		return aEncontrado;
	}

	
	public void ganadorCarrera2() {

		Double mejorTiempo = Double.MAX_VALUE;
		ArrayList<Atleta> ganadores = new ArrayList<>();

		for (Atleta a : this.atletasList) {
			if (a.getSegundos() <= mejorTiempo) {
				mejorTiempo = a.getSegundos();
				ganadores.add(a);
			}
		}

		if (ganadores.size() <= 1) {
			System.out.println("El ganador de la carrera de " + getNombreCarrera() + " es "
					+ ganadores.get(0).getNombre() + " con un tiempo de " + ganadores.get(0).getSegundos());
		} else {
			System.out.println("Los ganadores de la carrera de " + getNombreCarrera() + " son:");
			for (Atleta a : ganadores) {
				System.out.println(a.getNombre() + " con un tiempo de: " + a.getSegundos());
			}
		}
	}
	
	// No guarda empates en las posiciones, solo tres ganadores
	public void podio() {
		Atleta[] podio = new Atleta[3];
		Double ganador = Double.MAX_VALUE;
		Double segundo = Double.MAX_VALUE;
		Double tercero = Double.MAX_VALUE;
		
		
		for (Atleta a : this.atletasList) {
			if (a.getSegundos() < ganador) {
				ganador = a.getSegundos();
				podio[0] = a;
			} else if (a.getSegundos() < segundo) {
				segundo = a.getSegundos();
				podio[1] = a;
			} else if (a.getSegundos() < tercero) {
				tercero = a.getSegundos();
				podio[2] = a;
			}
		}
		
		System.out.println("Podio de la carrera:");
		System.out.println("1ero:	" + podio[0]);
		System.out.println("2do:	" + podio[1]);
		System.out.println("3ro:	" + podio[2]);
	}

	public Carrera(String nombreCarrera) {
		super();
		this.nombreCarrera = nombreCarrera;
		this.atletasList = new ArrayList<>();
	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	public ArrayList<Atleta> getAtletasList() {
		return atletasList;
	}

	public void setAtletasList(ArrayList<Atleta> atletasList) {
		this.atletasList = atletasList;
	}

}
