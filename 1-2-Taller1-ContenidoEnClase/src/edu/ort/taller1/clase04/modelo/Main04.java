package edu.ort.taller1.clase04.modelo;

public class Main04 {

	public static void main(String[] args) {

			//Alta de la Empresa
			EmpresaAgricola molinos = new EmpresaAgricola("Molinos", 2);
			
			molinos.cargarResultados();
			molinos.mostrarResultados();
			molinos.procesarResultados();

			System.out.println(molinos.buscarCosecha(3));
			
			System.out.println("La cosecha con más kilos fue la número: " + molinos.obtenerCosechaConMasKilos());
			System.out.println("La cosecha con más altura fue la número: " + molinos.obtenerCosechaConMasAltura());
	}
}