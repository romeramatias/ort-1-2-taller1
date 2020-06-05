package edu.ort.taller1.tp3.ex;

import edu.ort.taller1.tp3.ex.ex3.clases.Company;
import edu.ort.taller1.tp3.ex.ex3.clases.Refrigerator;
import edu.ort.taller1.tp3.ex.ex3.clases.Tv;
import edu.ort.taller1.tp3.ex.ex3.clases.Washer;

public class Ex3 {

	public static void main(String[] args) {

		// Entradas y salidas intentando el formato dl enunciado
		
		// Creacion de la clase empresa
		Company c = new Company();
		
		// Creo algunos productos
		Refrigerator e = new Refrigerator("Whirlpool", "H2745", "0001", 24, false, 14999.0, 250.0, false);
		Tv t = new Tv("Phillips", "49PGFS", "0002", 24, false, 14370.0, 49, true);
		Washer w = new Washer("Drean", 	"CONCEPT", "0003", 24, false, 6799.0, 6, false);
		
		// Agrego los productos al ArrayList de la empresa
		c.addProduct(e);
		c.addProduct(t);
		c.addProduct(w);
	
		// Ofrecimiento de productos y procedimiento a ticket de venta
		c.sellProducts();
	}

}
