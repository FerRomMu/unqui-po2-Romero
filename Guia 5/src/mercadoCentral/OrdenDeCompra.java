package mercadoCentral;

import java.util.ArrayList;

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
	public double getTotalAPagar() {
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
	public OrdenDeCompra agregarUtilidad(Utilidad p) {
		utilidad.add(p);
		return this;
	}

	/**
	 * Notifica a cada utilidad de que se realizo el pago.
	 */
	public void ejecutarCompra() {
		utilidad.stream().forEach(Utilidad::procesarPago);
	}

}
