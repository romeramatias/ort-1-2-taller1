package edu.ort.taller1.tp3.ex.ex3.clases;

public class Refrigerator extends Product {

	private double capacity;
	private boolean itsFrost;
	
	public Refrigerator(String brand, String model, String serialNum, int volt, boolean itsOn, double price, double capacity, boolean itsFrost) {
		super(brand, model, serialNum, volt, itsOn, price);
		this.capacity = capacity;
		this.itsFrost = itsFrost;
	}

	@Override
	public String toString() {
		return super.toString() + "Refrigerator [capacity=" + capacity + ", itsFrost=" + itsFrost + "]";
	}
	
	@Override
	public void show() {
		System.out.print(this.getClass().getSimpleName() + " ");
		super.showBrandModel();
	}
	
	public void showComplete() {
		String className = this.getClass().getSimpleName();
		String frost = stringFrost();
		String brandModel = super.printBrandModel();
		double price = super.getPrice();
		
		System.out.println(className + " "+ brandModel + ", "+frost +", Capacidad " + this.capacity + " litros, Precio: $" + price);
		
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public boolean isItsFrost() {
		return itsFrost;
	}

	public void setItsFrost(boolean itsFrost) {
		this.itsFrost = itsFrost;
	}
	
	public String stringFrost() {
		String s;
		if (itsFrost) {
			s = "Frost";
		} else {
			s = "No frost";
		}
		return s;
	}
	
	
}
