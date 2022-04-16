package supermercado;

public class ProductoPrimeraNecesidad extends Producto{

	double descuento = 0.9;

	public ProductoPrimeraNecesidad(String n, double p, boolean b, double d) {
		super(n,p,b);
		this.setDescuento(d);
	}

	private void setDescuento(double d) {
		this.descuento = d;
	}

	private double getDescuento() {
		return this.descuento;
	}
	
	public ProductoPrimeraNecesidad(String n, double p, boolean b) {
		super(n,p,b);
	}

	public ProductoPrimeraNecesidad(String n, double p) {
		super(n,p);
	}
	
	public Double getPrecio() {
		return super.getPrecio() * this.getDescuento();
	}

}
