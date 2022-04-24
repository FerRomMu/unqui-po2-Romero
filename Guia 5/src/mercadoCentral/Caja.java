package mercadoCentral;

import java.util.ArrayList;

public class Caja {

	/**
	 * Un stock de los productos de la tienda.
	 */
	Stock stock;
	/**
	 * Una lista de todas las ordenes de compras
	 * de clientes.
	 */
	ArrayList <OrdenDeCompra> orden;
	
	/**
	 * Constructor de Caja.
	 */
	public Caja(Stock s) {
		orden = new ArrayList <OrdenDeCompra>();
		stock = s;
	}
	
	/**
	 * Registra la compra de un producto si
	 * hay stock. Si no informa que no hay.
	 * @param p El producto a registrar.
	 * @param c La orden de compra donde se registra.
	 */
	public void registrarProducto(Producto p, OrdenDeCompra c) {
		if(stock.hayStockDe(p)){
			c.agregarProducto(p);
			stock.modificarStockDe(p, -1);
		}else {
			System.out.println("No hay stock del producto.");
		}
	}
	
	public double montoAPagarDe (OrdenDeCompra c) {
		return c.getTotalAPagar();
	}
}
