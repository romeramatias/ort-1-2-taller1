package edu.ort.taller1.tp3.ex.ex3.clases;

public class Blender extends Product {

	private int power;
	private int numOfSpeeds;
	
	public Blender(String brand, String model, String serialNum, int volt, boolean itsOn, double price, int power, int numOfSpeeds) {
		super(brand, model, serialNum, volt, itsOn, price);
		this.power = power;
		this.numOfSpeeds = numOfSpeeds;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getNumOfSpeeds() {
		return numOfSpeeds;
	}

	public void setNumOfSpeeds(int numOfSpeeds) {
		this.numOfSpeeds = numOfSpeeds;
	}

	@Override
	public void show() {
		System.out.print(this.getClass().getSimpleName() + " ");
		super.showBrandModel();		
	}

	@Override
	public void showComplete() {
		// TODO Auto-generated method stub
		
	}
	
	
}

