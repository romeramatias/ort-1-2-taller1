package ar.edu.ort.tp1.tp2Ejercicio05;
import ar.edu.ort.tp1.tp2Ejercicio04.Mueble;
import ar.edu.ort.tp1.tp2Ejercicio04.Persona;
import ar.edu.ort.tp1.tp2Ejercicio04.Vivienda;

public class TestEjercicio05 {
	public static void main(String[] args) {
		Edificio edificio = new Edificio ("Montañeses", "1234");
		Vivienda vivienda1 = new Vivienda();
		vivienda1.setDireccion("Montañeses", 1234, "4", "C");
		Vivienda vivienda2 = new Vivienda();
		vivienda2.setDireccion("Montañeses", 1234, "2", "B");
		
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
		
		edificio.agregarVivienda(vivienda1);
		edificio.agregarVivienda(vivienda2);
		edificio.mostrar();
		System.out.println("SE HA REALIZADO LA MUDANZA DE VIVIENDA 1 A VIVIENDA 2");
		edificio.realizarMudanza(vivienda1, vivienda2);
		edificio.mostrar();
	}
}