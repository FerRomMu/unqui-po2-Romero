package mercadoCentral;

import java.util.ArrayList;

public class Caja {

	/**
	 * Un stock de los productos de la tienda.
	 */
	Stock stock;
	/**
	 * Una lista de todas las ordenes de compras
	 * de clientes y una lista de las ordenes finalizadas.
	 */
	ArrayList <OrdenDeCompra> orden, ordenesFacturadas;
	
	/**
	 * Constructor de Caja.
	 * Con un stock dado.
	 */
	public Caja(Stock s) {
		orden = new ArrayList <OrdenDeCompra>();
		ordenesFacturadas = new ArrayList <OrdenDeCompra>();
		stock = s;
	}
	
	/**
	 * Constructo de Caja.
	 * Con un stock vacio.
	 */
	public Caja() {
		orden = new ArrayList <OrdenDeCompra>();
		stock = new Stock();
	}

	/*
	 * Se debe considerar cambiar registrarImpuesto y registrarServicio
	 * por registrarSinStock(NoStockable s, ordenDeCompra c) de haber mas
	 * tipos que no requieran stock.
	 * A su vez de haber mas tipos que requieran stock cambiar registrarProducto
	 * por registrarConStock(Stockable s, ordenDeCompra c)
	 */
	
	/**
	 * Registra la compra de un producto si
	 * hay stock. Si no informa que no hay.
	 * @param p El producto a registrar.
	 * @param c La orden de compra donde se registra.
	 */
	public void registrarProducto(Producto p, OrdenDeCompra c) {
		if(stock.hayStockDe(p)){
			c.agregarUtilidad(p);
			stock.modificarStockDe(p, -1);
		}else {
			System.out.println("No hay stock del producto.");
		}
	}
	
	public void registrarImpuesto(Impuesto i, OrdenDeCompra c) {
		c.agregarUtilidad(i);
	}
	
	public void registrarServicio(Servicio s, OrdenDeCompra c) {
		c.agregarUtilidad(s);
	}
	
	/**
	 * Devuelve el monto a pagar
	 * de una orden determinada.
	 * @param c La orden consultada
	 * @return el valor total a pagar
	 */
	public double montoAPagarDe (OrdenDeCompra c) {
		return c.getTotalAPagar();
	}
	
	/**
	 * Se procesa la orden de compra dada
	 * para completar el pago.
	 * @param c La orden pagada.
	 */
	public void facturar (OrdenDeCompra c) {
		c.ejecutarCompra();
		ordenesFacturadas.add(c);
		orden.remove(c);
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
