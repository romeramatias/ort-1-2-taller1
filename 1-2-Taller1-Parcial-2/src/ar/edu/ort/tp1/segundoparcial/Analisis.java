package ar.edu.ort.tp1.segundoparcial;

public class Analisis extends Actividad {
	
	public enum Resultado { OK, INFECTADO };
	
	private Resultado resultAnalisis;

	// 3 - Complear el constructor
	public Analisis(String fecha, String hora, char es, String desc, Resultado resultAnalisis) {
		super(fecha, hora, es, desc);
		setResultAnalisis(resultAnalisis);
	}
	
	public Analisis(int nro) {
		super(nro);
	}

	public Resultado getResultAnalisis() {
		return resultAnalisis;
	}

	public void setResultAnalisis(Resultado resultAnalisis) {
		this.resultAnalisis = resultAnalisis;
	}

	// 4 - Completar
	public void mostrar() {
		super.mostrar();
		System.out.println(this.resultAnalisis);
	}

	@Override
	public String showTipo() {
		return "Analisis";
	}
}
