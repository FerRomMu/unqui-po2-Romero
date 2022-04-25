package mercadoCentral;

public class Servicio implements Utilidad {

	double costoPorUnidad;
	int cantidadConsumida=0;
	
	public Servicio(double c) {
		costoPorUnidad = c;
	}
	
	public Servicio(double c, int i) {
		costoPorUnidad = c;
		cantidadConsumida = i;
	}
	
	public void consumirN(int n) {
		cantidadConsumida += n;
	}
	
	@Override
	/**
	 * Devuelve el costo por el servicio dado.
	 */
	public double getPrecio() {
		return costoPorUnidad * cantidadConsumida;
	}

	@Override
	public void procesarPago() {
		
	}

}
