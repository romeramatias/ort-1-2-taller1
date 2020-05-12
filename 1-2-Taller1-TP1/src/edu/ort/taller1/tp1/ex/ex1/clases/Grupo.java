package edu.ort.taller1.tp1.ex.ex1.clases;

import java.util.ArrayList;

public class Grupo {

	private String stringNombreGrupo;
	private ArrayList<String> integrantesList;

	public Grupo(String stringNombreGrupo) {
		super();
		this.stringNombreGrupo = stringNombreGrupo;
		this.integrantesList = new ArrayList<String>();
	}

	public int getCantidadIntegrantes() {
		return this.integrantesList.size();
	}

	public void agregarIntegrante(String nombreIntegrante) {
		String nombreEncontrado = null;
		nombreEncontrado = buscarIntegrante(nombreIntegrante);
		if (nombreEncontrado == null) {
			integrantesList.add(nombreIntegrante);
			System.out.println(nombreIntegrante + " fue asignado al grupo " + getStringNombreGrupo());
		} else {
			System.out.println(nombreEncontrado + ": integrante existente");
		}
	}

	public String buscarIntegrante(String nombreIntegrante) {
		Integer index = 0;
		String nombreEncontrado = null;
		String auxiliar;

		while (this.integrantesList.size() > index && nombreEncontrado == null) {
			auxiliar = integrantesList.get(index);
			if (auxiliar.equals(nombreIntegrante)) {
				nombreEncontrado = auxiliar;
			}
			index++;
		}

		return nombreEncontrado;
	}

	public int obtenerPosicionIntegrante(String nombreIntegrante) {

		Integer index = 0;
		Integer posicionEncontrada = -1;

		while (index < this.integrantesList.size() && posicionEncontrada == -1) {
			String nombreEncontrado = this.integrantesList.get(index);
			if (nombreIntegrante.equals(nombreEncontrado)) {
				posicionEncontrada = index;
			}
			index++;
		}

		return posicionEncontrada;
	}

	public String obtenerIntegrante(int posicion) {

		String nombreEncontrado = null;
		if (posicion >= 1) {
			if (this.integrantesList.get(posicion - 1) != null && this.integrantesList.size() > posicion) {
				nombreEncontrado = this.integrantesList.get(posicion - 1);
			}
		}

		return nombreEncontrado;
	}

	public String removerIntegrante(String nombreIntegrante) {
		String integranteBuscado = buscarIntegrante(nombreIntegrante);
		System.out.println(integranteBuscado);
		if (integranteBuscado != null) {
			integrantesList.remove(integranteBuscado);

		}
		return integranteBuscado;
	}

	public void mostrarIntegrantes() {
		Integer i = 0;
		for (String s : integrantesList) {
			System.out.println("Posicion " + i + " " + s.toString());
			i++;
		}

		System.out.println("La cantidad de integrantes es " + getCantidadIntegrantes());
	}

	public void mostrar() {
		System.out.println("Nombre del grupo: " + getStringNombreGrupo());
		mostrarIntegrantes();
	}

	public void vaciar() {
		integrantesList.clear();
	}

	@Override
	public String toString() {
		return "Grupo [stringNombreGrupo=" + stringNombreGrupo + ", listIntegrantes=" + integrantesList + "]";
	}

	public String getStringNombreGrupo() {
		return stringNombreGrupo;
	}

	// Metodo privado de set nombre del grupo
	public void setStringNombreGrupo(String stringNombreGrupo) {
		this.stringNombreGrupo = stringNombreGrupo;
	}

	public ArrayList<String> getListIntegrantes() {
		return integrantesList;
	}

	public void setListIntegrantes(ArrayList<String> listIntegrantes) {
		this.integrantesList = listIntegrantes;
	}

}
