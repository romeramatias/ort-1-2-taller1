package ar.edu.ort.taller.Ejercicio1;
import java.util.ArrayList;
public class Grupo {
	
	private String nombre;
	ArrayList<String> listaIntegrantes;
	
	public Grupo (String nombre) {
		listaIntegrantes = new ArrayList<String>();
		setNombre(nombre);
	}
	public String getNombre() {
		return nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidadIntegrantes() {
		return listaIntegrantes.size();
	}
	
	public void agregarIntegrante(String nombreIntegrante) {
		boolean agregado = false;
		if (listaIntegrantes.size() == 0) {
			listaIntegrantes.add(nombreIntegrante);
			System.out.println("Se agrego "+ nombreIntegrante + " al grupo: " + getNombre());
		}
		else
		{
			for (int i = 0; i < listaIntegrantes.size(); i++) {
				if(listaIntegrantes.get(i).equals(nombreIntegrante)) {
					agregado = true;
				}
			}
			if(!agregado) {
				listaIntegrantes.add(nombreIntegrante);
				System.out.println(nombreIntegrante + " fue asignado al grupo: " + getNombre());
			}
		}		
	}
	
	public int obtenerPosicionIntegrante(String nombreIntegrante) {
		int i = 0;
		boolean encontro = false;
		while (i < listaIntegrantes.size() && !encontro){
			if(listaIntegrantes.get(i).equals(nombreIntegrante)) {
				encontro = true;
			}else{
				i++;
			}
		}

		if (encontro){
			return i;
		}else{
			return -1;
		}
	}
	
	public String obtenerIntegrante(int posicion) {
		if (posicion < listaIntegrantes.size()&& posicion>=1)
			return listaIntegrantes.get(posicion-1);
		else
			return null;
	}
	
	public String buscarIntegrante(String nombre) {
		int pos = obtenerPosicionIntegrante(nombre);
		if (pos != -1){
			return listaIntegrantes.get(pos);
		}else{
			return null;
		}
	}
	public String removerIntegrante(String nombreIntegrante) {
		int pos = obtenerPosicionIntegrante(nombreIntegrante);
		if (pos != -1){
			listaIntegrantes.remove(pos);
			return nombreIntegrante;
		}else{
			return null;
		}
	}
	
	private void mostrarIntegrantes() {
		if (getCantidadIntegrantes() > 0) {
			System.out.println("en total " + getCantidadIntegrantes() + " Integrantes y sus nombres son:");
			for (int i = 0; i < listaIntegrantes.size(); i++) {
				System.out.println("Integrante: " + listaIntegrantes.get(i));
			}
		} else {
			System.out.println("No hay integrantes.");
		}
	}
	
	public void mostrar() {
		if (listaIntegrantes.size() > 0) {
			System.out.print("El Grupo: " + this.nombre + " tiene ");
			mostrarIntegrantes();
		}else {
			System.out.println("No hay integrantes.");
		}
	}
	
	public void vaciar() {
		listaIntegrantes.clear();
	}	
}