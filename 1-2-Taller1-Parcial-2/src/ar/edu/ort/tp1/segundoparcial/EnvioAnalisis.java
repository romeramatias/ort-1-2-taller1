package ar.edu.ort.tp1.segundoparcial;

public class EnvioAnalisis extends Actividad {
	private float tamanio;
	private String tipoVirus;

	// 3 - Completar el constructor
	public EnvioAnalisis(String fecha, String hora, char es, String desc, float tamanio, String tipoVirus) {
		super(fecha, hora, es, desc);
		setTamanio(tamanio);
		setTipoVirus(tipoVirus);
	}

	public float getTamanio() {
		return tamanio;
	}

	public String getTipoVirus() {
		return tipoVirus;
	}

	// 4 - Completar
	public void mostrar() {
		super.mostrar();
		System.out.print(" Tamanio:" + this.tamanio);
		System.out.println(" tipo " + this.tipoVirus);
	}

	@Override
	public String showTipo() {
		return "EnvioAnalisis";
	}

	public void setTamanio(float tamanio) {
		this.tamanio = tamanio;
	}

	public void setTipoVirus(String tipoVirus) {
		this.tipoVirus = tipoVirus;
	}
	
	
}