package edu.ort.taller1.tp3.ex.ex3.clases;

import java.util.ArrayList;
import java.util.Scanner;


public class Company {

	private ArrayList<Product> productsList;
	private ArrayList<Product> soldProducts;

	public Company() {
		this.productsList = new ArrayList<>();
		this.soldProducts = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Company [productsList=" + productsList + "]";
	}

	public void addProduct(Product p) {
		this.productsList.add(p);
	}
	
	public void sellProducts() {
		int i = 0;
		int valor = -1;
			while(i < this.productsList.size() && valor != 0) {
			this.productsList.get(i).show();
			valor = leerIntSellProducts();
			if (valor == 1) {
				System.out.println("Ha agregado a su compra:");
				this.productsList.get(i).showComplete();
				this.soldProducts.add(this.productsList.get(i));
				System.out.println("-----------------------------------------");
			} else {
				System.out.println("-----------------------------------------");
			}
			i++;
			}
			System.out.println("Ofrecimiento de productos finalizado");
			System.out.println("-----------------------------------------");
			printReceipt();
	}
	
	private void printReceipt() {
		if (this.soldProducts.size() > 0) {
			System.out.println("Ticket de venta");
			System.out.println("Articulos:");
			double sumatoria = 0;
			for (Product product : soldProducts) {
				product.showComplete();
				sumatoria += product.getPrice();
			}
			System.out.println("Total: $" + sumatoria);
		} else {
			System.out.println("Usted no ha adquirido productos");
		}
	
	}
	
	private int leerIntSellProducts() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int valor = -1;
		System.out.println("Desea agregar este producto a su ticket?");
		System.out.println("1- Si");
		System.out.println("2- No");
		System.out.println("0- Salir");
		valor = scan.nextInt();
		while (valor < 0 || valor > 2) {
			System.out.println("Intente nuevamente");
			System.out.println("Desea agregar este producto a su ticket?");
			System.out.println("1- Si");
			System.out.println("2- No");
			System.out.println("0- Salir");
			valor = scan.nextInt();
		}
		
		return valor;
	}
	
	public ArrayList<Product> getProductsList() {
		return productsList;
	}

	public void setProductsList(ArrayList<Product> productsList) {
		this.productsList = productsList;
	}
	
	
	
	
}
