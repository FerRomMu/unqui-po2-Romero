package mercadoCentral;

import java.util.ArrayList;

/**
 * Clase encargada de administrar las ordenes de compra del local.
 * @author fercho
 *
 */
public class Caja {

	/**
	 * Una lista de todas las ordenes de compras
	 * de clientes y una lista de las ordenes finalizadas.
	 */
	ArrayList <OrdenDeCompra> orden;
	
	/**
	 * Constructor de Caja.
	 */
	public Caja() {
		orden = new ArrayList <OrdenDeCompra>();
	}

	/**
	 * Crea una nueva orden y la agrega
	 * al listado de ordenes.
	 * @return
	 */
	public Caja nuevaOrden() {
		OrdenDeCompra ordenNueva = new OrdenDeCompra();
		orden.add(ordenNueva);
		return this;
	}
	
	/**
	 * Devuelve la orden n de compra.
	 * @param n El indice del orden a devolver.
	 * @return la orden de indice n.
	 */
	public OrdenDeCompra getOrdenN(int n) {
		return orden.get(n);
	}
}
