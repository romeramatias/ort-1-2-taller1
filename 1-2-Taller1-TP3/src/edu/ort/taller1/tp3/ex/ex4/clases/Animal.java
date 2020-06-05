package edu.ort.taller1.tp3.ex.ex4.clases;

public abstract class Animal {

		private String nombre;
		private double peso;
		private double tamanio;
		
		
		public Animal(String nombre, double peso, double tamanio) {
			super();
			this.nombre = nombre;
			this.peso = peso;
			this.tamanio = tamanio;
		}

		@Override
		public String toString() {
			return "Animal [nombre=" + nombre + ", peso=" + peso + ", tamanio=" + tamanio + "]";
		}
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
		}
		public double getTamanio() {
			return tamanio;
		}
		public void setTamanio(double tamanio) {
			this.tamanio = tamanio;
		}
	
		
}
