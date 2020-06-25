/** @author romeramatias 
 */
package ar.edu.ort.tp1.segundoparcial;

import java.util.Scanner;


public class Test2Par {

	private static final int MIN_CLIENTE = 1;
	private static final int MAX_CLIENTE = 1000;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO - Reemplazar con lo que se pide para la creacion de DataCenter.

		DataCenter datacenter = null;
		int codCliente = cargarNroDeCliente(input);
		
		datacenter = new DataCenter("Datacenter", codCliente);
		datacenter.addServidor(new Servidor(1, "Win Server"));
		datacenter.addServidor(new Servidor(2, "Linux"));
		
		
		if (datacenter != null) {
			// TODO - Resolver los puntos que te pida el cuestionario.
			
			
			// El siguiente metodo genera datos de prueba para testear los
			// puntos pedidos. No quitar ni modificar.
			datacenter.generarDatos();
			// procesamiento - No modificar
			System.out.println("--Mostrando todas las actividades--");
			datacenter.mostrarActividades();
			System.out.println("--Mostrando los resultados--");
			datacenter.generarResultados();
			System.out.println("--Mostrando las actualizaciones--");
			datacenter.mostrarActualizaciones(1);
			// YA QUE NOS PIDIERON ESTE METODO PERO NUNCA LO LLAMARON PARA PROBARLO
			// LO TUVE QUE PONER YO
			datacenter.getServidor(0).correrEstadisticaN();
			System.out.println("--------------------------");
			datacenter.getServidor(1).correrEstadisticaN();

		} else
			System.out.println("No se creo el Centro de datos");
		input.close();
	}

	// 1-a completar para que capture la excepcion de tipo no numerico
	private static int cargarNroDeCliente(Scanner scanner) {
		int codigo = 0;
		boolean codigoOk = false;
		
		while (!codigoOk && (codigo > MAX_CLIENTE || codigo < MIN_CLIENTE)) {
			try {
				System.out.println("Ingrese el numero de cliente entre " + MIN_CLIENTE + " " + MAX_CLIENTE);
				codigo = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Error. debe ingresar un valor numerico entre " + MIN_CLIENTE + " " + MAX_CLIENTE);
				scanner.nextLine();
			}
		}
		
		return codigo;
	}

	// 1-b completar el nombre para que capture la excepcion de constructor
	private static DataCenter crearDataCenter(String nombre) {
		DataCenter dc = null;
		// TODO (solo si es tu tema)
		return dc;
	}
}
