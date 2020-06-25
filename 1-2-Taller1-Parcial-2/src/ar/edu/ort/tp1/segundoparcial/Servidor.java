package ar.edu.ort.tp1.segundoparcial;


public class Servidor {
	private int numero;
	private String SO;
	private Cola<Actividad> actividades;
	private Pila<Actividad> actualizaciones;

	// 2 - Completar el constructor
	public Servidor(int numero, String SO) {
		setNumero(numero);
		setSO(SO);
		this.actividades = new Cola<Actividad>();
		this.actualizaciones = new Pila<Actividad>();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero < 0 || numero > 1000) {
			throw new IllegalArgumentException("El numero del Sistema Operativo no puede ser menor a 0 o mayor a 1000");
		}
		this.numero = numero;
	}

	public String getSO() {
		return SO;
	}
	
	public void setSO(String sO) {
		if (sO == null || sO.isEmpty()) {
			throw new RuntimeException("Nombre de servidor invalido");
		}
		
		this.SO = sO;
	}

	public void agregarActividad(Actividad act) {
		actividades.add(act);
		if (act instanceof Actualizacion)
			actualizaciones.push(act);
	}

	// 5 - Mostrar todas las Actividades para cada servidor
	public void mostrarActividad() {
		final int NRO_CENTINELA = -1;
		Actividad act = new Analisis(NRO_CENTINELA);
		Actividad actividadAux;
		
		System.out.println("Todas las actividades del " + toString());
		agregarActividad(act);;
		actividadAux = this.actividades.pool();

		while (actividadAux.getNumero() != NRO_CENTINELA) {
			actividadAux.mostrar();
			this.actividades.add(actividadAux);
			actividadAux = this.actividades.pool();
		}
		
	}

	// 6 - Desarrolla el mostrar actualizaciones que te haya tocado
	public void mostrarActualizacionesN() {
		Actualizacion act = null;
		Pila<Actividad> aux = new Pila<Actividad>();
		
			while (!this.actualizaciones.isEmpty()) {
				act = (Actualizacion) this.actualizaciones.pop();
				act.mostrar();
				aux.push(act);
			}
			
			pasarElementosDe(aux, this.actualizaciones);
		
	}

	private void pasarElementosDe(Pila<Actividad> source, Pila<Actividad> target) {
		while (!source.isEmpty()) {
			target.push(source.pop());
		}
	}

	// 7 - Desarrolla el metodo estadistico que te haya sido requerido.
	public void correrEstadisticaN() {
	
		final int NRO_CENTINELA = -1;
		Actividad act = new Analisis(NRO_CENTINELA);
		Actividad actividadAux;
		int contador = 0;
		
		agregarActividad(act);;
		actividadAux = this.actividades.pool();

		while (actividadAux.getNumero() != NRO_CENTINELA) {
			if (actividadAux instanceof Actualizacion) {
				Actualizacion actualizacion = (Actualizacion) actividadAux;
				System.out.println(actualizacion.showTipo() + " Version:" + actualizacion.getVersionFirmaVirus());
				contador++;
			}
			actividadAux = this.actividades.pool();
		}
		
		System.out.println("Cantidad de actualizaciones: " + contador);
		
		
	}

	@Override
	public String toString() {
		return "Servidor:" + numero + ", S.O. " + SO;
	}

}