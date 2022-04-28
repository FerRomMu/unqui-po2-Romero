package mercadoCentral;

/**
 * Clase encargada de describir un producto del mercado.
 * Sabe su precio y conoce el stock al que pertenece.
 * @author fercho
 *
 */
public class Producto implements Utilidad {
	
	/**
	 * Precio base del producto.
	 */
	double precioBase;
	Stock miStock;
	
	/**
	 * Constructor del Producto.
	 * @param p El precio base del producto.
	 */
	public Producto(double p, Stock s) {
		this.setPrecioBase(p);
		miStock = s;
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

	/**
	 * Registra la compra de un producto si
	 * hay stock. Si no informa que no hay.
	 * @param p El producto a registrar.
	 * @param c La orden de compra donde se registra.
	 */
	public boolean registrar() {
		boolean bool = miStock.hayStockDe(this);
		if(bool){
			miStock.modificarStockDe(this, -1);
		}else {
			System.out.println("No hay stock del producto.");
		}
		return bool;
	}
}
