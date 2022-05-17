package uml;

public class SpecialProduct extends Product {

	public SpecialProduct(String n, float p) {
		super(n,p);
	}
	
	@Override
	public float getPrice() {
		/*algo especial*/
		return price;
	}
}
