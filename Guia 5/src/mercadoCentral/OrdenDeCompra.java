package mercadoCentral;

import java.util.ArrayList;

public class OrdenDeCompra {

	/**
	 * Lista de los productos que se compraron.
	 */
	ArrayList<Producto> productos;
	
	/**
	 * Constructor de OrdenDeCompra.
	 */
	public OrdenDeCompra () {
		productos = new ArrayList<Producto>();
	}
	
	/**
	 * Devuelve el total a pagar de la compra.
	 * @return
	 */
	public double getTotalAPagar() {
		return productos.stream()
				.mapToDouble(Producto::getPrecio)
				.sum();
	}
	
	/**
	 * Agrega el producto dado a la orden
	 * de compra.
	 * @param p El producto a agregar.
	 * @return
	 */
	public OrdenDeCompra agregarProducto(Producto p) {
		productos.add(p);
		return this;
	}
}
