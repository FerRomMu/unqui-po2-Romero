package mercadoCentral;

public interface Utilidad {

	/**
	 * Obtiene el precio de la utilidad.
	 * @return el precio a pagar.
	 */
	public double getPrecio();
	
	/**
	 * Describe el comportamiento de la
	 * utilidad cuando se confirma la compra.
	 */
	public boolean registrar();

}
