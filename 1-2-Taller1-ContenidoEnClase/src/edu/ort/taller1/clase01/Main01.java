package edu.ort.taller1.clase01;

import java.util.ArrayList;
import java.util.Scanner;

import edu.ort.taller1.clase01.clases.*;

public class Main01 {
	static Scanner scan = new Scanner(System.in);

	
	public static void main(String[] args) {
		
		
		Matematica matematica = new Matematica();
		Integer intNumerosPares = 0;
		Integer intNumerosImpares = 0;
		
		matematica.agregarNumero(1);
		matematica.agregarNumero(1,2);
		matematica.agregarNumero(3);
		matematica.agregarNumero(4);
		matematica.agregarNumero(5);
		
		
		intNumerosPares = matematica.obtenerNumerosPares();
		intNumerosImpares = matematica.obtenerNumerosImpares();

		
		System.out.println("Cantidad de numeros pares: " + matematica.getIntNumerosPares());
		System.out.println("Cantidad de numeros impares: " + matematica.getIntNumerosImpares());


		
		System.out.println("Cantidad de numeros pares: " + intNumerosPares);
		System.out.println("Cantidad de numeros impares: " + intNumerosImpares);
		
		Cadena cadena = new Cadena();
		
		cadena.agregarNombre("Matias Romera");
		cadena.agregarNombre("Pablo Ulman");
		
		Integer intCantidadNombres = cadena.obtenerCantidadNombres("m");
		
		System.out.println("Cantidad de nombres con m = " + intCantidadNombres);
	}

	
	
	public static void mainViejo(String[] args) {
	
		ArrayList<Integer> numerosList = new ArrayList<>();
		Integer intNumerosPares = 0;
		Integer intNumerosImpares = 0;
	
		
		
		for (int i = 1; i <= 5 ; i++) {
			int intNumeroIngresado = leerInt();
			numerosList.add(intNumeroIngresado);
		}
		
		// Recorrido con foreach
		/*for (Integer num : numerosList) {
			numerosList.get(num);
			if (num % 2 == 0) {
				System.out.println(num + "es par");
			} else {
				System.out.println(num + "es impar");
			}
		}*/
		
		//Recorrido con for
		for (int i = 0; i < numerosList.size(); i++) {
			Integer intNumeroActual = numerosList.get(i);
			if (intNumeroActual % 2 == 0) {
				intNumerosPares++;
			} else {
				intNumerosImpares++;
			}
		}
		
		System.out.println(intNumerosPares);
		System.out.println(intNumerosImpares);
		
		
	}
	

	
	public static int leerInt() {
		System.out.println("Ingrese un numero:");
		int numero = scan.nextInt();
		return numero;
	}
}
