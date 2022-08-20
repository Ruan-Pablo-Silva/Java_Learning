package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) { //recebe quantidade como argumento
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return "o produto tônico " + name + " com preço tônico " + String.format("%.3f", price) +  				
				" tem a quantidade total de " + totalValueInStock()  + "produtos no estoque";
				
	}
}
