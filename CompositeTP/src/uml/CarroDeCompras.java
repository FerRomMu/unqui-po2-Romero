package uml;

import java.util.Iterator;
import java.util.List;


public class CarroDeCompras {

	List<Product> elements;
	
	//No tiene sentido este metodo.
	private void setElement(List<Product> p){
		elements = p;
	}
	
	public List<Product> getElements() {
		return elements;
	}
	
	public int totalRounded() {
		return elements.stream()
				.mapToInt(p -> Math.round(p.getPrice()))
				.sum();
	}
	
	public float total() {
		float ac = 0;
		for (Product p : elements) {
			ac += p.getPrice();
		}
		return ac;
	}
}
