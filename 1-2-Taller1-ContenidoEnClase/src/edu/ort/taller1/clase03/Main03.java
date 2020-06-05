package edu.ort.taller1.clase03;

import java.util.ArrayList;

import edu.ort.taller1.clase03.clases.*;

public class Main03 {

	public static void main(String[] args) {
		
		//creacionDeObjetos1();
		//creacionDeObjetos2UpCasting();
		//creacionDeObjetos3ArrayList();
		metodoEquals();
	}

	private static void metodoEquals() {
		Triangulo t1 = new Triangulo("Rojo", 4, 2.5);
		@SuppressWarnings("unused")
		Triangulo t2 = new Triangulo("Rojo", 4, 2.5);
		Triangulo t3 = new Triangulo("Verde", 4, 2.5);

		System.out.println(t1.equals(t3));
	}

	@SuppressWarnings("deprecation")
	public static void creacionDeObjetos3ArrayList() {
		ArrayList<Poligono> poligonosList = new ArrayList<>();
		
		poligonosList.add(new Poligono("Poligono", "Azul"));
		poligonosList.add(new Triangulo("Rojo", 4, 2.5));
		poligonosList.add(new Cuadrado("Verde", 4));
		
		
		for (Poligono poligono : poligonosList) {
			poligono.mostrar();
			// instanceof es un operador
			if (poligono instanceof Cuadrado) {
				((Cuadrado) poligono).unMetodoEspecial();
			} else if (poligono instanceof Triangulo) {
				((Triangulo) poligono).unMetodoEspecial();
			}
		}
	}
	

	public static void creacionDeObjetos1() {
		Poligono p = new Poligono("Poligono", "Azul");
		Triangulo t = new Triangulo("Rojo", 4, 2.5);
		Cuadrado c =  new Cuadrado("Verde", 4);
		
		p.mostrar();
		t.mostrar();
		c.mostrar();
	
		//t.unMetodoTriangulo();
	}
	
	@SuppressWarnings("deprecation")
	public static void creacionDeObjetos2UpCasting() {
		// Upcasting, hereda todos los metodos igual
		// Pero los metodos propios de las clases heredadas no se pueden ejecutar
		// Habria que castear
		Poligono p = new Poligono("Poligono", "Azul");
		Poligono t = new Triangulo("Rojo", 4, 2.5);
		Poligono c =  new Cuadrado("Verde", 4);
		
		p.mostrar();
		t.mostrar();
		c.mostrar();
		
		// Casteo de metodo a una clase heredada
		((Triangulo)t).unMetodoEspecial();
		((Cuadrado)c).unMetodoEspecial();
		
		// Esto daria un error en tiempo de ejecucion, ClassCastException
		// El metodo nunca esta definido en la clase Cuadrado
		// ((Triangulo)c).unMetodoTriangulo();
		
		

	}
}
