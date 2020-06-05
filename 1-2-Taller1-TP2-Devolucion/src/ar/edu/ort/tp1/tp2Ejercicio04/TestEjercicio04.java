package ar.edu.ort.tp1.tp2Ejercicio04;

public class TestEjercicio04 {

	public static void main(String[] args) {
		Vivienda vivienda1 = new Vivienda();
		vivienda1.setDireccion("Montañeses", 1234, "4", "C");
		Persona persona = new Persona("Arturo", "Roman", 53);
		Persona persona2 = new Persona("Monica", "Gaztambide", 35);
		
		vivienda1.agregarPersona(persona);
		vivienda1.agregarPersona(persona2);
		
		Mueble mueble1 = new Mueble("Mesa", "Marron", "Madera");
		Mueble mueble2 = new Mueble("Mesada", "Rojo", "Marmol");
		Mueble mueble3 = new Mueble("Perchero", "Negro", "Metal");
		Mueble mueble4 = new Mueble("Sillon",  "Azul", "Cuero");
		vivienda1.agregarMueble(mueble1);
		vivienda1.agregarMueble(mueble2);
		vivienda1.agregarMueble(mueble3);
		vivienda1.agregarMueble(mueble4);
		
		System.out.println("Vivienda 1:");
		vivienda1.mostrar();		
	}
}
