package edu.ort.taller1.clase04.modelo;

public class Main04 {

	public static void main(String[] args) {

			//Alta de la Empresa
			EmpresaAgricola molinos = new EmpresaAgricola("Molinos", 2);
			
			molinos.cargarResultados();
			molinos.mostrarResultados();
			molinos.procesarResultados();

			System.out.println(molinos.buscarCosecha(3));
			
			System.out.println("La cosecha con m�s kilos fue la n�mero: " + molinos.obtenerCosechaConMasKilos());
			System.out.println("La cosecha con m�s altura fue la n�mero: " + molinos.obtenerCosechaConMasAltura());
	}
}