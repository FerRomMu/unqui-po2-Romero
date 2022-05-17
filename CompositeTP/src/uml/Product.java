package uml;

public class Product {

	float price;
	String name;
	
	public Product(String n, float p) {
		name = n;
		price = p;
	}
	
	public String getName() {
		return name;
	}
	
	public float getPrice() {
		return price;
	}
}
