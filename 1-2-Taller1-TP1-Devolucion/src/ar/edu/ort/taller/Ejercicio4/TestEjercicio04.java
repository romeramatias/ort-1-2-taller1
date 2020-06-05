package ar.edu.ort.taller.Ejercicio4;

public class TestEjercicio04 {

	public static void main(String[] args) {
		
		Anio a2 = new Anio();
				
		System.out.println();
		System.out.println("Obtener Nombre de un mes:");
		System.out.println(a2.getNombreMes(12));
		System.out.println(a2.getNombreMes(5));
		System.out.println("------------------");
		System.out.println("han transcurrido: "+(a2.diasTranscurridos(9)+14)+" dias");
	}
}
