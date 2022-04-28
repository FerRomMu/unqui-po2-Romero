package mercadoCentral;

public class ProductoDeCooperativa extends Producto {

	/**
	 * Constructor del Producto.
	 * @param p El precio base del producto.
	 */
	public ProductoDeCooperativa (double p, Stock s) {
		super(p, s);
	}
	
	/**
	 * Devuelve el precio final del producto.
	 * @return
	 */
	@Override
	public double getPrecio () {
		return precioBase * 0.9d;
	}
}
