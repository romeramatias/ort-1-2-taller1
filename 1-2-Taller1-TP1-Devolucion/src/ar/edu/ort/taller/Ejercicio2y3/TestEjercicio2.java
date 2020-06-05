package ar.edu.ort.taller.Ejercicio2y3;

public class TestEjercicio2 {

	public static void main(String[] args) {
		// Creo una nueva competencia
		Competencia carrera1 = new Competencia("100 mts");
		
		// Creo atletas
		Atleta atleta1 = new Atleta("Antonio", 9.81);
		Atleta atleta2 = new Atleta("Bruno", 9.85);
		Atleta atleta3 = new Atleta("Carlos", 9.86);
		Atleta atleta4 = new Atleta("Daniel", 10.01);
		Atleta atleta5 = new Atleta("Esteban", 9.97);
		Atleta atleta11 = new Atleta("Mariana", 10.01);
		Atleta atleta12 = new Atleta("Luis", 9.80);
		Atleta atleta13 = new Atleta("Cesar", 9.97);
		Atleta atleta14 = new Atleta("Marisa", 10.01);
		Atleta atleta15 = new Atleta("Silvia", 9.80);
		
		// Agrego los atletas a la competencia
		carrera1.agregarParticipantes(atleta1);
		carrera1.agregarParticipantes(atleta2);
		carrera1.agregarParticipantes(atleta3);
		carrera1.agregarParticipantes(atleta4);
		carrera1.agregarParticipantes(atleta5);
		carrera1.agregarParticipantes(atleta11);
		carrera1.agregarParticipantes(atleta12);
		carrera1.agregarParticipantes(atleta13);
		carrera1.agregarParticipantes(atleta14);
		carrera1.agregarParticipantes(atleta15);
			
		System.out.println("Competencia #1");
		System.out.println();
		
		System.out.println("Atletas ganadores: ");
		for (Atleta ganadores : carrera1.getGanadores()) {
			System.out.println(ganadores.toString());
		}
	}
}
