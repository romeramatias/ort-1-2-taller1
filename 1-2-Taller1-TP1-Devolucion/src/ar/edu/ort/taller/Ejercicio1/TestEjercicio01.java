package ar.edu.ort.taller.Ejercicio1;

public class TestEjercicio01 {

	public static void main(String[] args) {
		Grupo grupo = new Grupo("GrupoPrueba");

		agregarAlGrupo("Uriel Segaloff", grupo);
		agregarAlGrupo("Marco Cupo", grupo);
		agregarAlGrupo("Profesor 3", grupo);

		System.out.println("-----------");
		agregarAlGrupo("ficticio", grupo);
		System.out.println("-----------");
		grupo.mostrar();
		System.out.println("-----------");
		buscarEnGrupo("ficticio", grupo);
		System.out.println("-----------");
		buscarEnGrupo("inexistente", grupo);
		System.out.println();
		System.out.println(grupo.obtenerIntegrante(2));
		System.out.println("-----------");
		System.out.println("Se ha eliminado " + grupo.removerIntegrante("ficticio"));
		System.out.println("-----------");
		grupo.mostrar();
		System.out.println("-----------");
		grupo.vaciar();
		System.out.println("-----------");
		grupo.mostrar();	
	}
	
	public static void agregarAlGrupo(String nombre, Grupo grupo) {
		grupo.agregarIntegrante(nombre);
	}
	
	public static void buscarEnGrupo(String nombre, Grupo grupo) {
		if (!nombre.isEmpty()) {
			if(grupo.buscarIntegrante(nombre) != null) {
				System.out.println("El Integrante: " + nombre + " se encuentra en el grupo");
			}
			else {
				System.out.println("El integrante: " + nombre + " no se encuentra en el grupo");
			}
		}
		else {
			System.out.println("No se encuentra al Integrante.");
		}
	}
}
