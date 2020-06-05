package edu.ort.taller1.tp3.ex.ex3.clases;

public class Washer extends Product{

	private double maxKg;
	private boolean itsAutomatic;
	
	public Washer(String brand, String model, String serialNum, int volt, boolean itsOn, double price, double maxKg, boolean itsAutomatic) {
		super(brand, model, serialNum, volt, itsOn, price);
		this.maxKg = maxKg;
		this.itsAutomatic = itsAutomatic;
	}

	@Override
	public void show() {
		System.out.print(this.getClass().getSimpleName() + " ");
		super.showBrandModel();
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "Washer [maxKg=" + maxKg + ", itsAutomatic=" + itsAutomatic + "]";
	}

	public double getMaxKg() {
		return maxKg;
	}

	public void setMaxKg(double maxKg) {
		this.maxKg = maxKg;
	}

	public boolean isItsAutomatic() {
		return itsAutomatic;
	}

	public void setItsAutomatic(boolean itsAutomatic) {
		this.itsAutomatic = itsAutomatic;
	}

	@Override
	public void showComplete() {
		String className = this.getClass().getSimpleName();
		String automatic = stringAutomatic();
		String brandModel = super.printBrandModel();
		double price = super.getPrice();
		double maxKg = this.getMaxKg();
		
		System.out.println(className + " " + brandModel + ", " + automatic + ", carga maxima " + maxKg + "kg, Precio: $" + price);
		
		
	}
	
	public String stringAutomatic() {
		String s = "automatico";
		
		if (itsAutomatic) {
			return s;
		} else {
			s = "semi" + s;
		}
		
		return s;
		
	}
	



	
	
}
