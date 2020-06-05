package edu.ort.taller1.clase01.clases;

import java.util.ArrayList;

public class Matematica {

	ArrayList<Integer> numerosList;
	private Integer intNumerosPares = 0;
	private Integer intNumerosImpares = 0;
	
	
	public Matematica() {
		super();
		this.numerosList = new ArrayList<>();
	}

	public void agregarNumero(Integer num) {
		numerosList.add(num);
		if (esPar(num)) {
			intNumerosPares++;
		} else {
			intNumerosImpares++;
		}
	}
	
	public void agregarNumero(Integer num, Integer num2) {
		this.agregarNumero(num);
		this.agregarNumero(num2);
	}
	
	
	public void borrarNumero(Integer num) {
		
	}
	
	
	private boolean esPar(Integer num) {
		boolean esPar = false;
		
		if (num % 2 == 0) {
			esPar = true;
		}
		
		return esPar;
	}
	
	
	public Integer getIntNumerosPares() {
		return intNumerosPares;
	}

	public void setIntNumerosPares(Integer intNumerosPares) {
		this.intNumerosPares = intNumerosPares;
	}

	public Integer getIntNumerosImpares() {
		return intNumerosImpares;
	}

	public void setIntNumerosImpares(Integer intNumerosImpares) {
		this.intNumerosImpares = intNumerosImpares;
	}

	public Integer obtenerNumerosPares() {
		Integer intReturn = 0;
		Integer intNumeroActual;
		
		for (int i = 0; i < numerosList.size(); i++) {
			intNumeroActual = numerosList.get(i);
			if (intNumeroActual % 2 == 0) {
				intReturn++;
			}
		}
		
		return intReturn;
	}
	
	public Integer obtenerNumerosImpares() {
		Integer intReturn = 0;
		Integer intNumeroActual;
		
		for (int i = 0; i < numerosList.size(); i++) {
			intNumeroActual = numerosList.get(i);
			if (intNumeroActual % 2 != 0) {
				intReturn++;
			}
		}
		
		return intReturn;
	}
	
	
}
