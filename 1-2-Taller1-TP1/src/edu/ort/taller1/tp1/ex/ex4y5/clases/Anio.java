package edu.ort.taller1.tp1.ex.ex4y5.clases;

import java.util.Arrays;

public class Anio {

	private String[] meses;
	private Integer[] dias;

	public Anio() {
		super();
		this.meses = new String[12];
		this.meses[0] = "Enero";
		this.meses[1] = "Febrero";
		this.meses[2] = "Marzo";
		this.meses[3] = "Abril";
		this.meses[4] = "Mayo";
		this.meses[5] = "Junio";
		this.meses[6] = "Julio";
		this.meses[7] = "Agosto";
		this.meses[8] = "Septiembre";
		this.meses[9] = "Octubre";
		this.meses[10] = "Noviembre";
		this.meses[11] = "Diciembre";
		// this.meses = new String[]{"ENERO","FEREBRO","MARZO","ABRIL","MAYO","JUNIO","JULIO",
		// "AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};
		
		this.dias = new Integer[12];
		this.dias[0] = 31;
		this.dias[1] = 29;
		this.dias[2] = 31;
		this.dias[3] = 30;
		this.dias[4] = 31;
		this.dias[5] = 30;
		this.dias[6] = 31;
		this.dias[7] = 31;
		this.dias[8] = 30;
		this.dias[9] = 31;
		this.dias[10] = 30;
		this.dias[11] = 31;
	}

	public String getNombreDelMes(int numeroMes) {

		String mesInvalido = "Numero de mes invalido";
		String nombreMes = null;

		if (numeroMes > 12) {
			return mesInvalido;
		} else {
			switch (numeroMes) {
			case 1:
				nombreMes = this.meses[0];
				break;
			case 2:
				nombreMes = this.meses[1];
				break;
			case 3:
				nombreMes = this.meses[2];
				break;
			case 4:
				nombreMes = this.meses[3];
				break;
			case 5:
				nombreMes = this.meses[4];
				break;
			case 6:
				nombreMes = this.meses[5];
				break;
			case 7:
				nombreMes = this.meses[6];
				break;
			case 8:
				nombreMes = this.meses[7];
				break;
			case 9:
				nombreMes = this.meses[8];
				break;
			case 10:
				nombreMes = this.meses[9];
				break;
			case 11:
				nombreMes = this.meses[10];
				break;
			case 12:
				nombreMes = this.meses[11];
			}

			return nombreMes;
		}
	}

	public int diasTranscurridos(int numeroMes) {
		Integer acumulador = 0;
		Integer index = 0;

		while (index < numeroMes - 1) {
			acumulador += this.dias[index];
			index++;
		}

		return acumulador;

	}

	public int diasTranscurridos(int numeroDia, int numeroMes) {
		Integer acumulador = 0;
		Integer index = 0;

		// Habria que validar numeroDia
		while (index <= numeroMes - 1) {
			if (index == numeroMes - 1) {
				acumulador += numeroDia;
			} else {
				acumulador += this.dias[index];
			}
			index++;
		}

		return acumulador;

	}

	public int mostrarDias() {
		Integer acumulador = 0;

		for (Integer i : dias) {
			acumulador += i;
		}

		return acumulador;
	}

	@Override
	public String toString() {
		return "Anio [meses=" + Arrays.toString(meses) + ", dias=" + Arrays.toString(dias) + "]";
	}

}
