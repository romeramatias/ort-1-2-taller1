package edu.ort.taller1.clase02.clases;

import java.util.Arrays;

public class Estacionamiento {

	private Automovil[][] matrizEspacios;

	public Estacionamiento(int pasillos, int posiciones) {
		super();
		this.matrizEspacios = new Automovil[pasillos][posiciones];
		this.matrizEspacios[0][4] = new Automovil(TipoVehiculo.COMUN);
	}

	public void inicializarEstacionamiento() {
		for (int f = 0; f < matrizEspacios.length; f++) {
			for (int c = 0; c < matrizEspacios[f].length; c++) {
				this.matrizEspacios[f][c] = null;
			}
		}
	}

	public boolean estaOcupado(int pasillo, int posicion) {
		boolean estaOcupado = false;
		if (this.matrizEspacios[pasillo][posicion] != null) {
			estaOcupado = true;
		}
		return estaOcupado;
	}

	public int cantidadDisponible() {
		int cont = 0;

		for (int f = 0; f < matrizEspacios.length; f++) {
			for (int c = 0; c < matrizEspacios[f].length; c++) {
				if (matrizEspacios[f][c] == null) {
					cont++;
				}
			}
		}

		return cont;
	}

	public boolean ocuparEspacio(int pasillo, int posicion, Automovil auto) {
		boolean ocupe = false;

		if (!(estaOcupado(pasillo, posicion))) {
			this.matrizEspacios[pasillo][posicion] = auto;
			ocupe = true;
			System.out.println("Espacio asignado correctamente");
		} else {
			System.out.println("Espacio ocupado");
		}

		return ocupe;
	}

	public double recaudarHoy() {
		double sum = 0;
		for (int f = 0; f < matrizEspacios.length; f++) {
			for (int c = 0; c < matrizEspacios[f].length; c++) {
				if (estaOcupado(f, c)) {
					sum += matrizEspacios[f][c].getImporte();
				}
			}
		}
		return sum;
	}

	public double recaudarPasillo(int pasillo) {
		double sum = 0;
		for (int i = 0; i < matrizEspacios[pasillo].length; i++) {
			if (estaOcupado(pasillo, i)) {
				sum += matrizEspacios[pasillo][i].getImporte();
			}
		}
		return sum;

	}

	public int cuantosAutosHayEnLaPosicion(int posicion) {
		int cont = 0;
		for (int i = 0; i < matrizEspacios.length; i++) {
			if (estaOcupado(i, posicion)) {
				cont++;
			}
		}

		return cont;
	}

	@Override
	public String toString() {
		return "Estacionamiento [matrizEspacios=" + Arrays.toString(matrizEspacios) + "]";
	}

	public Automovil[][] getMatrizEspacios() {
		return matrizEspacios;
	}

	public void setMatrizEspacios(Automovil[][] matrizEspacios) {
		this.matrizEspacios = matrizEspacios;
	}

}
