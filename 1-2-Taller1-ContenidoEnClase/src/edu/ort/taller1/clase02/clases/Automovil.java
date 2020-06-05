package edu.ort.taller1.clase02.clases;

public class Automovil {

	private TipoVehiculo tipo;
	// private Enum<TipoVehiculo> tipo;
	private final double PRECIO_COMUN = 110.05;
	private final double PRECIO_TAXI = 65.0;
	private final double PRECIO_POLICIA = 40.50;

	public Automovil(TipoVehiculo tipo) {
		super();
		this.tipo = tipo;
	}

	public double getImporte() {
		double retorno = 0;
		
		switch (tipo) {
		case COMUN:
			retorno = PRECIO_COMUN;
			break;
		case POLICIA:
			retorno = PRECIO_POLICIA;
			break;
		case TAXI:
			retorno = PRECIO_TAXI;
			break;
		default	:
			return 0;
		}
		
		return retorno;
	}

	@Override
	public String toString() {
		return "Automovil [tipo=" + tipo + "]";
	}

	public Enum<TipoVehiculo> getTipo() {
		return tipo;
	}

	public void setTipo(TipoVehiculo tipo) {
		this.tipo = tipo;
	}

}
