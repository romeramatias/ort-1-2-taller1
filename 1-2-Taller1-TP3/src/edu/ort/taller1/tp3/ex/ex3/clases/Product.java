package edu.ort.taller1.tp3.ex.ex3.clases;

public abstract class Product {

	private String brand;
	private String model;
	private String serialNum;
	private int volt;
	private boolean itsOn;
	private double price;


	public Product(String brand, String model, String serialNum, int volt, boolean itsOn, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.serialNum = serialNum;
		this.volt = volt;
		this.itsOn = itsOn;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [brand=" + brand + ", model=" + model + ", serialNum=" + serialNum + ", volt=" + volt
				+ ", itsOn=" + itsOn + ", price=" + price + "]";
	}
	
	public abstract void show();
	
	public abstract void showComplete();
	
	public void showBrandModel() {
		System.out.println(this.brand + " " + this.model);
	}
	
	public String printBrandModel() {
		String s = this.brand + ", Modelo " + this.model;
		return s;
	}
	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public int getVolt() {
		return volt;
	}

	public void setVolt(int volt) {
		this.volt = volt;
	}

	public boolean isItsOn() {
		return itsOn;
	}

	public void setItsOn(boolean itsOn) {
		this.itsOn = itsOn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
}
