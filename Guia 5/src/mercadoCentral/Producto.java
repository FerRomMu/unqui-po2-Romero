package mercadoCentral;

public class Producto implements Utilidad {
	
	/**
	 * Precio base del producto.
	 */
	double precioBase;
	
	/**
	 * Constructor del Producto.
	 * @param p El precio base del producto.
	 */
	public Producto(double p) {
		this.setPrecioBase(p);
	}

	/**
	 * Devuelve el precio final del producto.
	 * @return
	 */
	public double getPrecio() {
		return precioBase;
	}

	private void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	@Override
	public void procesarPago() {
		
	}

}
