package mercadoCentral;

import java.util.HashMap;
import java.util.Map;

public class Stock {

	/**
	 * Multiset que representa el stock de productos.
	 * Se representa con un hashmap.
	 * La key es el producto.
	 * El value la cantidad.
	 * Si el value es 0 entonces se remueve la key.
	 */
	Map <Producto, Integer> stock;
	
	/**
	 * Constructor. Crea una instancia de stock.
	 */
	public Stock () {
		stock = new HashMap<Producto, Integer>();
	}
	
	/**
	 * Retorna si hay stock del producto dado.
	 * @param p El producto.
	 * @return
	 */
	public Boolean hayStockDe(Producto p) {
		return stock.containsKey(p);
	}
	
	/**
	 * Modifica el stock de un producto en el valor dado.
	 * Si el producto no esta lo agrega.
	 * Si n es negativo disminuye la cantidad de stock.
	 * Si el stock resultante es negativo o 0 se remueve
	 * el producto.
	 * @param p El producto.
	 * @param n La cantidad a aumentar.
	 */
	public Stock modificarStockDe(Producto p, int n) {
		stock.put(p, this.getCantidadDe(p)+n);
		if(stock.get(p) <= 0) {
			stock.remove(p);
		}
		return this;
	}
	
	private int getCantidadDe(Producto p) {
		return stock.getOrDefault(p, 0);
	}
}