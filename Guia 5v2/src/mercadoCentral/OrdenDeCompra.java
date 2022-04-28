package mercadoCentral;

import java.util.ArrayList;

/**
 * Clase encargada de administrar todos
 * las utilidades que se compraron en esa
 * orden.
 * @author fercho
 *
 */
public class OrdenDeCompra {

	/**
	 * Lista de los productos, impuestos y servicios que se compraron.
	 */
	ArrayList<Utilidad> utilidad;
	
	/**
	 * Constructor de OrdenDeCompra.
	 */
	public OrdenDeCompra () {
		utilidad = new ArrayList<Utilidad>();
	}
	
	/**
	 * Devuelve el total a pagar de la compra.
	 * @return
	 */
	public double montoAPagar() {
		return utilidad.stream()
				.mapToDouble(Utilidad::getPrecio)
				.sum();
	}
	
	/**
	 * Agrega la utilidad dada a la orden
	 * de compra.
	 * @param p La utilidad a agregar.
	 * @return
	 */
	public OrdenDeCompra registrarUtilidad(Utilidad p) {
		if(p.registrar()) {
			utilidad.add(p);
		}
		return this;
	}
}
