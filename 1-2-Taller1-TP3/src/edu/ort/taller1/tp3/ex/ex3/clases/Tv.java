package edu.ort.taller1.tp3.ex.ex3.clases;

public class Tv extends Product{

	
	private double inch;
	private boolean itsSmart;
	
	public Tv(String brand, String model, String serialNum, int volt, boolean itsOn, double price, double inch, boolean itsSmart) {
		super(brand, model, serialNum, volt, itsOn, price);
		this.inch = inch;
		this.itsSmart = itsSmart;
	
	}

	@Override
	public String toString() {
		return super.toString() + "Tv [inch=" + inch + ", itsSmart=" + itsSmart + "]";
	}

	@Override
	public void show() {
		System.out.print(this.getClass().getSimpleName() + " ");
		super.showBrandModel();
	}
	
	public double getInch() {
		return inch;
	}

	public void setInch(double inch) {
		this.inch = inch;
	}

	public boolean isItsSmart() {
		return itsSmart;
	}

	public void setItsSmart(boolean itsSmart) {
		this.itsSmart = itsSmart;
	}

	@Override
	public void showComplete() {
		String className = this.getClass().getSimpleName();
		String smart = stringSmart();
		String brandModel = super.printBrandModel();
		double price = super.getPrice();
		double inches = this.getInch();
		
		System.out.println(className + " " + smart + " " + brandModel + ", " + inches + " pulgadas, Precio: $" + price);
		
		
	}
	
	public String stringSmart() {
		String s;
		if (itsSmart) {
			s = "Smart";
		} else {
			s = "";
		}
		 
		return s;
	}
	
	
}
